package array;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1,1,0,0,1,1,1,0,1,1,1,1,1};
        System.out.println(findConsecutiveOnes(nums));
    }
    public static int findConsecutiveOnes(int[] nums) {
        int count1=0,count2=0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==1) {
                count1++;
            }
            else{
                count1=0;
            }
            count2=Math.max(count1,count2);
        }
        return count2;
    }
}
