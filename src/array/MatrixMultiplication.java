package array;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] one = {
                {1,2,3},
                {4,5,6}
        };
        int [][] two = {
                {1,1},
                {1,2},
                {2,1}
        };
        int[][] res=multi(one,two);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] multi(int[][] one, int[][] two) {
        int [][] result = new int [one.length][two[0].length];
        
        for(int i=0;i<one.length;i++){
            int sum = 0;
            for(int j=0;j<two[0].length;j++) {
                for (int k = 0; k < one[0].length; k++) {
                    sum += one[i][k] * two[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
