package String;
public class LargestOddNumber {
    public static void main(String[] args) {
        String num = "00214678";
        int idx=-1;
        int i;
        for(i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                idx=i;
                break;
            }
        }
        if(idx==-1) System.out.println("");
        i=0;
        while(i<=idx && num.charAt(i)=='0'){
            i++;
        }
        System.out.println(num.substring(i, idx+1));
    }
}
//problem 1903