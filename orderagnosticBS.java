//order agnostic binary search work on sorted array in both ascending and desending array of elements.
public class orderagnosticBS {
    public static void main(String[] args) {
        //int[] num={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int [] num ={99,80,75,22,15,11,10,5,2-3};
        int target=15;
        int ans=agnosticBS(num,target);
        System.out.println(ans);
    }
    static int agnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isASC=arr[start]<arr[end];

        while(start<=end){
            // in java sometimes for  big values after obtaining by start+end will exceed the range of int
            //instead of writing int mid=(start+end)/2 you can write int mid=start+ (end-start)/2
            int mid =start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
        
            if (isASC){    
                if (target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }  
}