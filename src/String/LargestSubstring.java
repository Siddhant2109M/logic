package String;

public class LargestSubstring {
    public static void main(String[] args) {
        String str ="ojdncpvyneqo";
        int[] indices = new int[26];
        int maxLen =-1;
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i) - 'a';
            if(indices[idx]>0){
                maxLen=Math.max(maxLen,i-indices[idx]);
            }
            else{
                indices[idx]=i+1;
            }
        }
        System.out.println(maxLen);
    }
}
