package BinarySearch;

public class FindSqrt {
    public static void main(String[] args) {
        int x=36;
        int left = 1, right = x / 2, ans = 0;
        while (left <= right){
            int mid = left + (right-left) / 2;
            if ((mid * mid) <= x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        System.out.println(ans);
    }
}
