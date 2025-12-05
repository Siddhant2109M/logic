package BinarySearch;

public class FloorAndCeil {
    public static int findFloor(int[] nums, int x) {
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]<=x){
                ans=nums[mid];
                st=mid+1;
            }
            else{
                end=mid-1;  
            }
        }
        return ans;
    }
    public static int findCeil(int[] nums, int x) {
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>=x){
                ans=nums[mid];
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={3, 4, 4, 7, 8, 10};
        int x=5;
        int[] res =new int[2];
        res[0]=findFloor(nums,x);
        res[1]=findCeil(nums,x);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
