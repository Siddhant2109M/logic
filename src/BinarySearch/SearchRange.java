package BinarySearch;

public class SearchRange {
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
        int[] nums={5,7,7,8,8,10};
        int target =6;
        int[] res=new int[2];
        res[0]=firstOccurrence(nums,target);
        res[1]=lastOccurrence(nums,target);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
