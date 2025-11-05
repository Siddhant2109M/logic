package Pattern;
import java.util.Scanner;

//     *
//    **
//   ***
//  **** 
// ***** 

public class first3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int csp=1;csp<=space;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=star;cst++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            star++;

        }
    }
}
