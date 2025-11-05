package Pattern;
import java.util.Scanner;

// *     *
// **   **
// *** ***
// *******
// *** ***
// **   **
// *     * 

public class four2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-2;
        for(int i=1;i<=n;i++){
            for(int cst=1;cst<=star;cst++){
                System.out.print("*");
            }
            for(int csp=1;csp<=space;csp++){
                System.out.print(" ");
            }
            int sstar=star;
            if(i==n/2 +1){
                sstar=sstar-1;
            }
            for(int cst=1;cst<=sstar;cst++){
                System.out.print("*");
            }
            if(i<=n/2){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
}
