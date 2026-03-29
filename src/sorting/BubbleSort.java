package sorting;

//Bubble Sort Algorithm
//Compare each element with the next element and swap them if they are in the wrong order
//Repeat this process until the entire array is sorted
//Time Complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted)
public class BubbleSort {
    public static void bubbleSort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false; //this variable tracks whether we did any swap during this iteration or not
            // if we do no swap ,and it remains false, it means the array is already sorted 
            for(int j=0;j<n-1-i;j++){
                //this loop goes in the unsorted starting part and swap adjacent elements to move bigger elements on right
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) return; //if no swap is done, it means the array is already sorted, so we can break the loop
        }
    }
    public static void main(String[] args) {
        int[] nums={15,1,6,3,-1,2,10};
        bubbleSort(nums);
        for(int el:nums){
            System.out.print(el+" ");
        }
    }
}
