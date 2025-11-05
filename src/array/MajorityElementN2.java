package array;

import java.util.Arrays;

public class MajorityElementN2 {
    public static void main(String[] args){
        int[] nums={1,2};
        System.out.println(majority(nums));
    }

    public static int majority(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int cnt=1;
        int n=nums.length;
        for(i =0;i<n-1;i++){
            if(nums[i]==nums[i+1]) cnt++;
            if(cnt>n/2) return nums[i];
        }
        return nums[i];
    }
}
