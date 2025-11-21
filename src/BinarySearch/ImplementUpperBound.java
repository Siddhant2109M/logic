package BinarySearch;

//The upper bound algorithm finds the first or the smallest index in a sorted array 
//where the value at that index is greater than the given key i.e. x.
//The upper bound is the smallest index, ind, where arr[ind] > x.

public class ImplementUpperBound {
    public static int upperBound(int[] arr,int x){
        int st=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]>x){
                ans=mid;                
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2,3};
        int x=2;
        System.out.println(upperBound(arr,x));
    }
}
