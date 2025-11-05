package Recursion;

public class NaturalNo {
    public static void f(int a){
        if(a>0){
            System.out.println(a); //for decreasing order 6,5,4,3,2,1
            f(a-1);
            //System.out.println(a);//for increasing order 1,2,3,4,5,6
        }
    }
    public static void main(String[] args) {
       f(6);
    }
}
