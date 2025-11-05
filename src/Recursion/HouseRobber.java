//198. House Robber
//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing
// each of them is that adjacent houses have security systems connected and it will automatically contact
// the police if two adjacent houses were broken into on the same night.
//Given an integer array nums representing the amount of money of each house, 
//return the maximum amount of money you can rob tonight without alerting the police
package Recursion;

public class HouseRobber {
    public static int f(int[] nums,int idx){
        if(idx>=nums.length) return 0;
        return Math.max(nums[idx]+f(nums,idx+2),0+f(nums,idx+1));
    }
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int idx=0;
        System.out.println(f(nums,idx));
    }
}
