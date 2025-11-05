package array;

class SecondLargestElement{
    public static void main(String[] args) {
       int nums[]={8, 8, 7, 6, 5};
       int large=Integer.MIN_VALUE;
       int slarge=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           if(nums[i]>large){
            slarge=large;
            large=nums[i];
           }
           else if(nums[i]!=large&&nums[i]>slarge){
               slarge=nums[i];
           }
       }
       System.out.println(slarge);
    }
}