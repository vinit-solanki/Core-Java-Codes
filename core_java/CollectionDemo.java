import java.util.*;
public class CollectionDemo {
    public static void main(String[] args){
        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");

        List<Integer> ls = new ArrayList<>();
        ls.add(15);
        ls.add(23);
        ls.add(35);

        Iterator<Integer> values = ls.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('a');
        ts.add('z');
        ts.add('i');
        ts.add('o');
        Iterator<Character> tsValues = ts.iterator();
        while(tsValues.hasNext()){
            System.out.println(tsValues.next());
        }

        Map<String, Integer> phoneDiary = new HashMap<>();
        phoneDiary.put("John",1234555);
        
    }    
}
