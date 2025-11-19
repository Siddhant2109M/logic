package BinarySearch;

//The lower bound algorithm finds the first or the smallest index in a sorted array
//where the value at that index is greater than or equal to a given key i.e. x.

public class ImplementLowerBound {
    public static int lowerBound(int[] arr,int x){
        int st=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]>=x){
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
        int[] arr={3,5,8,15,19};
        int x=9;
        System.out.println(lowerBound(arr,x));
    }
}
