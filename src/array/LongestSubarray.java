package array;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums={10,5,2,7,1,9};
        int k=15;
        int st=0,end=0,maxLen=0;
        int sum=nums[0];
        while (end<nums.length) {
            while(st<= end && sum > k) {
                sum -= nums[st];
                st++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, end - st + 1);
            }
            end++;
            if (end < nums.length) {
                sum += nums[end];
            }
        }
        System.out.println(maxLen);
    }
}
