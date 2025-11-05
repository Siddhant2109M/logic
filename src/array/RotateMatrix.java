package array;
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}
                         ,{4, 5, 6}
                         ,{7, 8, 9}};
        int m = matrix.length;
        for (int col = 0; col < m; col++) {
            int i =0;
            int j =m-1;
            while(i<=j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                j--;
                i++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int []row : matrix){
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
