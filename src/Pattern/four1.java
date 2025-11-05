package Pattern;
import java.util.Scanner;

//*******  
//*** ***
//**   **
//*     *
public class four1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space =1;
        int star=(n/2)+1;
        for(int j=1;j<=(n*2)-1;j++){
                System.out.print("*");
            }
        System.out.println();    
        for(int i=2;i<=n;i++){
            for(int cst=1;cst<=star;cst++){
                System.out.print("*");
            }
            for(int csp=1;csp<=space;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=star;cst++){
                System.out.print("*");
            }
            System.out.println();
            space+=2;
            star--;
        }
    }
}
