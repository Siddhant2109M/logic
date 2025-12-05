package BinarySearch;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int target=0;
        boolean ans=false;
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                ans=true;
                break;
            }
            if(nums[st]==nums[mid]&&nums[mid]==nums[end]){
                st++;
                end--;
                continue;
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
