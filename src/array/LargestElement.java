package array;

public class LargestElement {
   public static void main(String[] args) {
    int nums[]={-4, -3, 0, 1, -8};
    int large = nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>large){
            large=nums[i];
        }
    }
    System.out.println(large);
   }
}
