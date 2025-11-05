package array;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,9};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
