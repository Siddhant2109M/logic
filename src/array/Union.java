package array;
import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int [] arr2={2,3,4,4,5};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                arr.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr.add(arr2[j]);
                j++;
            }
            else if(arr1[i]==arr2[j]){
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            arr.add(arr1[i]);
            i++;
        }
        while(j<m){
            arr.add(arr2[j]);
            j++;
        }
        System.out.println(arr);
    }
}
