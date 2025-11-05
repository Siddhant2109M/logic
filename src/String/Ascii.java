package String;

public class Ascii {
    public static void main(String[] args) {
        String str = "cdEfG";
        System.out.println(replacement(str));
    }
    public static String replacement(String str){
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            if(i%2==0){
                ch = (char)(ch+1);
                sb.setCharAt(i,ch);
            }
            else{
                ch = (char)(ch-1);
                sb.setCharAt(i,ch);
            }
        }
       return sb.toString();
    }
}
