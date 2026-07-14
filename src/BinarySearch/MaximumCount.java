package BinarySearch;
//LeetCode 2529 Maximum Count of Positive Integer and Negative Integer

public class MaximumCount {
    public static int pCount(int[] nums){
        int left=0;
        int right= nums.length-1;
        int ans =-1;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(nums[mid]>0){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(ans == -1) return 0;
        return nums.length -ans;
    }
    public static int nCount(int[] nums) {
        int left=0;
        int right= nums.length-1;
        int ans =-1;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(nums[mid]<0){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans+1;
    }
    public static void main(String[] args) {
        int[] nums={-2,-1,-1,0,0,1,2,3};
        int pCount= MaximumCount.pCount(nums);
        int nCount=MaximumCount.nCount(nums);
        System.out.println((pCount>=nCount)?pCount:nCount);
    }

}