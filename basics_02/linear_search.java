import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Value at index "+i+": ");
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number to search:");
        int num = in.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == num)
            System.out.println(num+" found at index-"+i);
            else{
                System.out.println(num+" is not in the array.");
                break;
            }
        }
        in.close();
    }
}
