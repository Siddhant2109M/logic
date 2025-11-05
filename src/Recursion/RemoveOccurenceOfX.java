package Recursion;
public class RemoveOccurenceOfX{
    static String f(String s,int idx,String ans){
        if(idx==s.length()) return ans;
        char ch=s.charAt(idx);
        if(ch!='x') ans+=ch;
        return f(s,idx+1,ans);
    }
    public static void main(String[] args) {
        String s="abcxxadxacxe";
        int idx=0;
        String ans="";
        System.out.println(f(s,idx,ans));
    }
}