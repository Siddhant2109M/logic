package Pattern;
import java.util.Scanner;

// *
// **
// ***
// ****
// ***
// **
// *

public class third1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<(n/2)+1){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
}
