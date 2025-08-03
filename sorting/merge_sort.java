public class merge_sort {
    public static void conqure(int[] arr, int s, int mid, int e){
        int[] merged = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                merged[k++]=arr[i++];
            } else{
                merged[k++]=arr[j++];
            }
        }
        while(i<=mid){
            merged[k++]=arr[i++];
        }
        while(j<=e){
            merged[k++]=arr[j++];
        }

        for(int c=0;c<merged.length;c++){
            arr[c+s] = merged[c];
        }
    }
    public static void divide(int[] arr, int s, int e){
        if(s>=e){
            System.out.println("Base Case Hit at:"+s+" "+e);
            return;
        }
        int mid = s+(e-s)/2;
        divide(arr, 0, mid);
        divide(arr, mid+1,e);
        conqure(arr, s, mid, e);
    }
    public static void main(String[] args){
       int[] arr = {5,7,2,1,2};
       int n = arr.length;
       divide(arr, 0, n-1);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       } 
    }
}
