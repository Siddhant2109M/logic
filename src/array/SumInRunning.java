package array;
import java.util.ArrayList;

class SumInRunning {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(add(nums));
        int[] result=runningSum(nums);
        for(int val:result){
            System.out.print(val +" ");
        }

    }
    public static ArrayList<Integer> add(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans.add(sum);
        }
        return ans;
    }

   public static int[] runningSum(int[] nums) {
       int[] result = new int[nums.length];
       result[0] = nums[0];
       for (int i = 1; i < nums.length; i++) {
           result[i]=result[i-1]+nums[i];
       }
       return result;
   }
}      

