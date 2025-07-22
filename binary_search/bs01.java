class bs01{
    public static int binarySearch(int[] arr, int target){
        int s =0; int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid]<target){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(target+" Found at index:"+binarySearch(arr, target));
    };
}