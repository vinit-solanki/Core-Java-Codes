class bubble_sort{
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,1};
        int n = arr.length;
        boolean swapped=false;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}