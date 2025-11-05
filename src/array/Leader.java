package array;

import java.util.ArrayList;

public class Leader {
        public static void main(String[] a){
        int[] arr={4,7,1,0};
        ArrayList<Integer> ans =new ArrayList<>();
        int max = arr[arr.length-1];
        ans.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max =arr[i];
                ans.add(max);
            }
        }
        System.out.println(ans);
    }
}

