package Pattern;
import java.util.Scanner;

// 1
// 12
// 123
// 1234
// 123
// 12
// 1

public class third2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            if(i<(n/2)+1){
                num++;
            }
            else{
                num--;
            }
            System.out.println();
        }
    }
}
