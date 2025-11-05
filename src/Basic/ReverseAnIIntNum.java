package Basic;
import java.util.Scanner;

public class ReverseAnIIntNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int num = sc.nextInt();
        while(num > 0||num < 0) {
            int digit = num % 10;
            num /= 10;
            ans = ans*10 + digit;
        }
            System.out.println(ans);
    }
}
