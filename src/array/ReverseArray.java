package array;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        display(arr);
        reverse(arr);
        display(arr);
    }
    public static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        System.out.println();
    }
}
