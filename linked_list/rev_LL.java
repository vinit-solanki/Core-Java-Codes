import java.util.LinkedList;

class rev_LL{
    public static void main(String[] args) {  
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int size = list.size();
        int s=0; int e=size-1;
        while(s<=e){
            int temp = list.get(s);
            list.set(s, list.get(e));
            list.set(e, temp);
            s++;
            e--;
        }
        System.out.println("Reversed Linked List: " + list);
    }
}