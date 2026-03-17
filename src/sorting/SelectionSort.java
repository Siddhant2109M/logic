package sorting;

//Selection Sort Algorithm 
//Find the minimum element in the array and swap it with the first element
//Then find the minimum element in the remaining array and swap it with the second element
//Repeat this process until the entire array is sorted

public class SelectionSort {
    //This method will return the index of minimum element in the array from start to nums.length-1
    public static int getMinimunIndex(int[] nums,int start){
        int minIndex=start;
        for(int i=start+1;i<nums.length;i++){ 
            if(nums[i]<nums[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    //This method will sort the array using selection sort algorithm
    public static void selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int minIndex=getMinimunIndex(nums, i);
            if(i!=minIndex){
                int temp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={15,1,6,3,-1,2,10};
        selectionSort(nums);
        for(int el:nums){
            System.out.print(el+" ");
        }
    }
}
 