public class quick_sort {
    public static int partition(int[] arr, int low, int high){
        int idx = low-1;
        int pivort = arr[high];
        for(int i=low;i<high;i++){
            if(arr[i]<=pivort){
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx]=temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[high];
        arr[high] = temp;
        return idx;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex-1);
        quickSort(arr, pIndex+1, high);
    }
    public static void main(String[] args){
        int[] arr= {3,2,4,1,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
