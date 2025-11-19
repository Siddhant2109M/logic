package Recursion;

public class Power2 {
    public static double myPow(double x,int n){
        if(n==0) return 1;
        return x*myPow(x, n-1);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }
}
