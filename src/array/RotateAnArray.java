package array;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        rotate(arr,k);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void rotate(int[] arr, int k){
        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }
        while(k>0){
            int temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            k--;
        }
    }
}
