package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=4;
        int ans=-1;
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            if(nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(ans);
    }
}
