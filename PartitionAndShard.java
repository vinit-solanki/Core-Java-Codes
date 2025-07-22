import java.security.MessageDigest;
import java.util.*;

public class PartitionAndShard {
    // Hash-based partitioning into fixed buckets
    static class Partitioning {
        private final int numPartitions;
        List<List<String>> partitions;

        public Partitioning(int numPartitions) {
            this.numPartitions = numPartitions;
            partitions = new ArrayList<>();
            for (int i = 0; i < numPartitions; i++) {
                partitions.add(new ArrayList<>());
            }
        }

        public int getPartition(String key) {
            return Math.abs(key.hashCode()) % numPartitions;
        }

        public void add(String key) {
            int p = getPartition(key);
            partitions.get(p).add(key);
            System.out.printf("→ Placed '%s' into PARTITION %d%n", key, p);
        }

        public void printState() {
            System.out.println("----- Partitions Status -----");
            for (int i = 0; i < numPartitions; i++) {
                System.out.printf("Partition %d: %s%n", i, partitions.get(i));
            }
            System.out.println();
        }
    }

    // Consistent hashing sharding across nodes (with virtual nodes)
    static class ConsistentHashing {
        private final SortedMap<Long, String> ring = new TreeMap<>();
        private final int vNodes;
        private final MessageDigest md;

        public ConsistentHashing(int vNodes) throws Exception {
            this.vNodes = vNodes;
            md = MessageDigest.getInstance("MD5");
        }

        private long hash(String s) {
            md.reset();
            md.update(s.getBytes());
            byte[] d = md.digest();
            long h = 0;
            for (int i = 0; i < 8; i++) {
                h = (h << 8) | (d[i] & 0xFF);
            }
            return h;
        }

        public void addNode(String node) {
            for (int i = 0; i < vNodes; i++) {
                long h = hash(node + "#" + i);
                ring.put(h, node);
                System.out.printf("♦ Added virtual node <%s#%d> at %d%n", node, i, h);
            }
        }

        public String getNode(String key) {
            long h = hash(key);
            var tail = ring.tailMap(h);
            long target = tail.isEmpty() ? ring.firstKey() : tail.firstKey();
            return ring.get(target);
        }

        public void printRing() {
            System.out.println("----- Hash Ring (hash -> node) -----");
            ring.forEach((h, node) ->
                System.out.printf("%20d : %s%n", h, node)
            );
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // 1. Partitioning
        Partitioning part = new Partitioning(3);
        part.add("user42");
        part.add("order99");
        part.add("sessionX");
        part.printState();

        // 2. Sharding with consistent hashing
        var ch = new ConsistentHashing(2);
        ch.addNode("ShardA");
        ch.addNode("ShardB");
        ch.addNode("ShardC");
        System.out.println();

        ch.printRing();

        List<String> keys = List.of("user42", "order99", "sessionX", "itemABC");
        System.out.println("----- Key -> Shard Mapping -----");
        for (String key : keys) {
            String node = ch.getNode(key);
            System.out.printf("Key '%s' => %s%n", key, node);
        }

        // 3. Show changes when removing a shard
        System.out.println("\n--- Removing ShardB ---\n");
        // Rebuild ring without ShardB
        ch = new ConsistentHashing(2);
        ch.addNode("ShardA");
        ch.addNode("ShardC");
        ch.printRing();
        for (String key : keys) {
            System.out.printf("Key '%s' => %s%n", key, ch.getNode(key));
        }
    }
}