import java.util.Scanner;

public class array_basics {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        // System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int size = in.nextInt();
        // int[] arr;
        // arr = new int[size];
        // for(int i=0;i<size;i++){
        // System.out.print("Enter the value at index "+i+"- ");
        //     int val = in.nextInt();
        //     arr[i] = val;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print("|"+arr[i]+"|");
        // }
        System.out.println("Enter no. of rows:");
        int rows = in.nextInt();
        System.out.println("Enter no. of cols:");
        int cols = in.nextInt();
        int[][] arr2d = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("arr["+i+"]"+"["+j+"]: ");
                int val = in.nextInt();
                arr2d[i][j] = val;
            }
        }
        printArray2d(arr2d);
        in.close();
    }
    
    static void printArray2d(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}