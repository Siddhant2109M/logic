package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,5,1};
        int st=0,end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                st=mid+1;
            }
        }
        System.out.println(st);
    }   
}
