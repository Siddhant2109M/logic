package array;
import java.util.ArrayList;
import java.util.List;

public class ArraySpiral {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}
        };
        int m=arr.length;
        int n=arr[0].length;
        int fRow=0;
        int lCol=n-1;
        int lRow=m-1;
        int fCol=0;
        List<Integer> res = new ArrayList<>();
        int count = m*n;
        while(count>0){
            //SR
            for(int i =fCol;i<=lCol;i++){
                res.add(arr[fRow][i]);
                count--;
            }
            fRow++;
            if(count==0) break;
            //EC
            for(int i =fRow;i<=lRow;i++){
                res.add(arr[i][lCol]);
                count--;
            }
            lCol--;
            if(count==0) break;
            //ER
            for(int i =lCol;i>=fCol;i--){
                res.add(arr[lRow][i]);
                count--;
            }
            lRow--;
            if(count==0) break;
            //SC
            for(int i =lRow;i>=fRow;i--){
                res.add(arr[i][fCol]);
                count--;
            }
            fCol++;
            if(count==0) break;
        }
        System.out.println(res);
    }
}
