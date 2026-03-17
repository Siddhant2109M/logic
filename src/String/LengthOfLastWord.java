package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        
        String s = "Hello World";
        String[] str = s.split(" ");
        System.out.println(str[str.length-1].length());
    }
      
}
