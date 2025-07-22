import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>(5);
        // 1.add
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);
        List1.add(50);
        List1.add(60);  // Dynamically added
        // List.remove(20);
        System.out.println("Size of List: "+List1.size());
        System.out.println("Is List Empty: "+List1.isEmpty());
        System.out.println("List Contains 40? :"+List1.contains(40));
        System.out.println("List Contains 23? :"+List1.contains(23));
        System.out.println("Index of 50? :"+List1.indexOf(50));
        System.out.println("Index of 25? :"+List1.indexOf(25));
        System.out.println(List1);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial size of the List:");
        int size = in.nextInt();
        System.out.println("Finding the max in List:");
        ArrayList<Integer> List2 = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            List2.add(in.nextInt());
        }
        max(List2);
        reverseList(List2);
        ReverseList(in);
        in.close();
    }

    static void max(ArrayList<Integer>List){
        int max=-1;
        for(int i=0;i<List.size();i++){
            if(max<List.get(i)){
                max=List.get(i);
            }
        }
        System.out.println("Max Element in the List: "+max);
    }

    static void reverseList(ArrayList<Integer>List){
        int s = 0;
        int e = List.size()-1;
        Integer[] arr = new Integer[List.size()];
        arr = List.toArray(arr);
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        List = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Reversed List:"+ List);
    }
    static void ReverseList(Scanner in){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the list:");
        int size = in.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Value at index "+i+": ");
            int num = in.nextInt();
            list.add(num);
        }
        int s = 0;
        int e = list.size()-1;
        while(s<e){
            int a = list.get(s);
            int b = list.get(e);
            list.set(s,b);
            list.set(e,a);
            s++;
            e--;
        }
        System.out.println("Reversed List:"+list);
    }
}
