public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={2,4,6,9,11,12,14,20,36,48};
        int target=48;
        int ans= binarysearch(nums,target);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // in java sometimes for  big values after obtaining by start+end will exceed the range of int
            //instead of writing int mid=(start+end)/2 you can write int mid=start+ (end-start)/2
            int mid =start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
