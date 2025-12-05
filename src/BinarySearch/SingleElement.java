package BinarySearch;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int st=1,end=nums.length-2;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
