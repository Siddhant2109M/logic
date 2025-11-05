package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s="IIII";
        int res=0;
        Map<Character,Integer> roman =new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        for(int i=0;i<s.length()-1;i++){
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }
        res+=roman.get(s.charAt(s.length() - 1));
        System.out.println(res);
    }
}
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int curr = value(s.charAt(i));

            // agar next character bada hai, to subtract karo
            if (i + 1 < n && curr < value(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }

    // helper function to map roman to integer
    private int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}