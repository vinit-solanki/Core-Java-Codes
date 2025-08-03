public class selection_sort {
    public static void main(String[] args){
        int[] arr = {5,3,8,4,2,1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int last = n-i-1;
            int maxIndex=i;
            for(int j=0;j<=last;j++){
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i]; 
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
