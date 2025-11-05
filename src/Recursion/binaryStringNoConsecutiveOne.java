package Recursion;

import java.util.Scanner;

public class binaryStringNoConsecutiveOne {
    public static int f(int n){
        if(n==1) return 2;
        if(n==2) return 3;
        return f(n-1) +f(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
