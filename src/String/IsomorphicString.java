package String;
// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.
public class IsomorphicString {
    public static void main(String[] args) {
        String s = "paper", t = "tible";
        System.out.println(isIsomorphic(s,t));
    }

    private static boolean isIsomorphic(String s, String t) {
        int[] m=new int[256];
        int[] n=new int[256];
        for(int i=0;i<s.length();i++){
            if(m[s.charAt(i)]!=n[t.charAt(i)]){
                return false;
            }
            m[s.charAt(i)]=i+1;
            n[t.charAt(i)]=i+1;
        }
        return true;    
    }
}
