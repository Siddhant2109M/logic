package BinarySearch;

public class InsertPosition {
    public static int searchInsert(int[] nums,int target){
        int st=0,end=nums.length-1,ans=nums.length;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }
}
