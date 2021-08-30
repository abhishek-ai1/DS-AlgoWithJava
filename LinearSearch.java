public class LinearSearch {
    public static void main(String[] args) {
        int [] nums={23,45,1,2,3,29,19,-3,30,16,-11,20};
        int target=-11;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index =0;index <arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
    return -1;
    }
    
}
