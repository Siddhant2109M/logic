package sorting;
//Insertion Sort Algorithm
//Divide the array into sorted and unsorted part, 
//and insert the current element in the correct position in the sorted part
//Time Complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted)
public class InsertionSort {
    public static void insertionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int currElement=nums[i];
            int j=i-1; // we want to go on the left side of i,and insert the current element in the correct position 
            while(j>=0 && nums[j]>currElement){ // we will keep moving the elements on the left side of i to the right until we find the correct position for current element
                nums[j+1]=nums[j]; // move the element to the right
                j--;
            }
            nums[j+1]=currElement; // insert the current element in the correct position
        }
    }
    public static void main(String[] args) {
        int[] nums={15,1,6,3,-1,2,10};
        insertionSort(nums);
        for(int el:nums){
            System.out.print(el+" ");
        }
    }
}
