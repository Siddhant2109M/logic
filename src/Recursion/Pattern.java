package Recursion;
public class Pattern {
    public static void main(String[] args) {
        int n=6;
        int tstars =0;
        tstars=n;
        f1(n);
        f2(n,tstars);

    }
    public static void f2(int n, int tstars) {
        if(n==0) return ;
         for(int i=0;i<tstars;i++){
            System.out.print("*");
        }
        System.out.println();
        f2(n-1,tstars);
    }
    public static void f1(int n) {    
        if(n==0) return ;
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        f1(n-1);
    }
}