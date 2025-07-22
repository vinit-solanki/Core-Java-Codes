import java.util.Arrays;
import java.util.Scanner;
public class binary_search{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = in.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0; i<n; i++){
        arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Sorted array: "+ Arrays.toString(arr));
    System.out.println("Enter the element to be searched:");
    int target = in.nextInt();
    int s = 0;
    int e = n-1;
    while(s<=e){
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            System.out.println("Element found at index: "+mid);
            break;
        }
        else if(arr[mid] < target){
            s = mid+1;
        } else{
            e = mid-1;
        }
    }
    if(s>e){
        System.out.println("Element not found!");
    }
    in.close();
}
}