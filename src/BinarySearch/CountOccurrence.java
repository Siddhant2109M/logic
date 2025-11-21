package BinarySearch;

public class CountOccurrence {
    public static int firstOccurrence(int[] nums,int target){
        int st=0,end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid= st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurrence(int[] nums,int target){
        int st=0,end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid= st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                st=mid+1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={2, 2 , 3 , 3 , 3 , 3 , 4};
        int target =2;
        System.out.println(lastOccurrence(nums, target)-firstOccurrence(nums, target)+1);
    }
}
