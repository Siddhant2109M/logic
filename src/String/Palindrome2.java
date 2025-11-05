package String;

public class Palindrome2 {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.print(isPalindrome2(s));
    }
    public static boolean isPalindrome2(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}