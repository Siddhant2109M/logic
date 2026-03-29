package sorting;
//Merge Sort Algorithm
//Divide the array into two halves, sort the two halves recursively and then merge the sorted halves
//Time Complexity: O(n log n) in all cases
public class MergeSort {
    public static int[] mergeTwoSortedArrays(int[] left,int[] right){
        int n=left.length;
        int m=right.length;
        int[] results=new int[n+m];//this array will hold the merged result of left and right arrays
        int i=0,j=0,k=0; //i,j,k are the pointers for left,right and result arrays respectively
        while(i<n && j<m){ //this loop will run until we have elements in both left and right arrays
            if(left[i]<right[j]){ //if the current element in left array is smaller than the current element in right array, we will add it to the result array
                results[k++]=left[i++];
            }else{ //if the current element in right array is smaller than the current element in left array, we will add it to the result array
                results[k++]=right[j++];
            }
        }
        while(i<n){ //if we have remaining elements in left array, we will add them to the result array
            results[k++]=left[i++];
        }
        while(j<m){ //if we have remaining elements in right array, we will add them to the result array
            results[k++]=right[j++];
        }
        return results; //return the merged result
    }
    public static void merge(int[] nums,int start,int mid,int end){
        int[] left=new int[mid-start+1]; //create a temporary array for left half
        int[] right=new int[end-mid]; //create a temporary array for right half
        int k=0; //this variable will be used to fill the left and right arrays
        for(int i=start;i<=mid;i++){
            left[k++]=nums[i];
        }
        k=0; //reset k to fill the right array
        for(int i=mid+1;i<=end;i++){
            right[k++]=nums[i];
        }
        int[] result=mergeTwoSortedArrays(left,right); //merge the two sorted arrays
        k=0; //this variable will be used to fill the original array with the merged result
        for(int i=start;i<=end;i++){
            nums[i]=result[k++];
        }
    }
    public static void f(int[] nums,int start,int end){
        if(end<=start) return; //base case, if the array has one or zero elements, it is already sorted
        int mid=start+(end-start)/2; //find the mid index of the array
        f(nums,start,mid); //sort the left half of the array
        f(nums,mid+1,end); //sort the right half of the array   
        merge(nums,start,mid,end); //merge the sorted halves
    }
    public static void mergesort(int[] nums){
        f(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums={15,1,6,3,-1,2,10};
        mergesort(nums);
        for(int el:nums){
            System.out.print(el+" ");
        }
    }
}
