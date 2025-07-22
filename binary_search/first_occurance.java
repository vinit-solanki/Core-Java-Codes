class first_occurance{
    public static int firstOccurance(int[] arr, int target){
        int ans = -1;
        int s =0; 
        int e=arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                e = mid-1;
            } else if(arr[mid]<target){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] arr, int target){
        int ans = -1;
        int s =0; int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                s = mid+1;
            } else if(arr[mid]<target){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,5,5,6};
        int target = 5;
        System.out.println(target+" Found at index:"+firstOccurance(arr, target));
        System.out.println(target+" Found at index:"+lastOccurance(arr, target));
        System.out.println("Total Occurance of "+target+" is: "+(lastOccurance(arr, target)-firstOccurance(arr, target)+1));
    };
}