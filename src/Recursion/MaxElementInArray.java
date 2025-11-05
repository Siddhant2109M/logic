package Recursion;

public class MaxElementInArray {
    public static int f(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        return Math.max(arr[idx], f(arr, idx+1));
    }
    public static void main(String[] args) {
        int[] arr={3,1,6,90,21,0,-1};
        int idx=0;
        System.out.println(f(arr,idx));
    }
}
