package array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
            sum1+=i+1;
        }
        return sum1-sum2;
    }
}