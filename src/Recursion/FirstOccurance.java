package Recursion;

public class FirstOccurance {
    public static int f(int[] arr,int x,int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==x) return idx;
        return f(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={3,1,6,2,8,6,5};
        int idx=0,x=6;
        System.out.println(f(arr,x,idx));
    }
}
