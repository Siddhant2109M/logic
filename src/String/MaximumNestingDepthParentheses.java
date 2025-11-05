package String;
class MaximumNestingDepthParentheses{
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        int cnt=0,maxPar=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            if(s.charAt(i)==')'){
                maxPar=Math.max(maxPar, cnt);
                cnt--;
            }
        }
        System.out.println(maxPar);
    }
}