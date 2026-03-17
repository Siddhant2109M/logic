package array;

public class Stock {
    public static void main(String[] args) {
        int[] stockPrice = {100, 180, 260, 310, 40, 535, 695};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : stockPrice) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        System.out.println("Maximum profit: " + maxProfit);
    }
}
