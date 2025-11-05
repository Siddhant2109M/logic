package array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] num={1,0,3,0,122,13,0,3,0,90};
        int k=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                num[k]=num[i];
                k++;
            }
        }
        while(k<num.length){
            num[k]=0;
            k++;
        }
        for(int val:num){
            System.out.print(val+" ");
        }
    }
}

