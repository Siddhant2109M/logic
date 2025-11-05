package Basic;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 2;
        int flag =0;
        while(div<num){
            if (num % div == 0) {
                flag = 1;
                break;
            }
            div++;
        }
        if(flag==1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
