package BinarySearch;

public class HowManyTimesArrayRotated {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int st=0,end=nums.length-1;
        while(st<end){
            int mid=(st+end)/2;
            if(nums[mid]>nums[end]){
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println(st);
    }
}
