public class insertion_sort {
    public static void main(String[] args){
        int[] arr = {5,6,9,3,1,2};
        int n = arr.length;
        int j=1;
        for(int i=0;i<=n-1;i++){
            j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }    
}
