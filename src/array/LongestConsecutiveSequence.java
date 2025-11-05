package array;
import java.util.Arrays;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums ={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums){
        int max=0,cnt =1;
        Arrays.sort(nums);
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            max =Math.max(max, cnt);
            if(nums[i]==nums[j]-1){
                cnt++;
                i++;
            }
            else if(nums[i]==nums[j]){
                i++;
                continue;
            }
            else{
                cnt=0;
            }
        }
        if(nums.length>0) max =Math.max(max, cnt);
        return max;
    }
}