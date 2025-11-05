package Basic;
import java.util.Scanner;


public class Armstrong {
    public static boolean isArmstrong(int n){
        int nod = countdigit(n);
        int on =n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum+=Math.pow(rem,nod);
            n/=10;
        }
        return sum==on;
    }

    private static int countdigit(int n) {
        int nod =0;
        while(n>0){
            n/=10;
            nod++;
        }
        return nod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));

    }
}
