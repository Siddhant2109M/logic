package array;
public class Wave2D{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for(int[] val:arr){
            for(int temp:val){
                System.out.print(temp+" ");
            }
        }
        System.out.println();
        for(int c=0;c<arr[0].length;c++){
            if(c%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][c]+" ");
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][c]+" ");
                }
            }
        }

    }
}
