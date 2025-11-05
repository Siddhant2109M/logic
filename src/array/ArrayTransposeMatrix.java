package array;
public class ArrayTransposeMatrix {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] transpose= new int[arr[0].length][arr.length];
        for(int c=0;c<arr.length;c++){
            for(int d=0;d<arr[0].length;d++){
                transpose[d][c]=arr[c][d];
            }
        }
        System.out.println();
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
