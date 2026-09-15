class Solution {
    public int maxProfit(int[] prices) {
        int buyP = prices[0];
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            profit = Math.max(profit, prices[i]-buyP);
            buyP = Math.min(prices[i], buyP);
        }
        return profit;
    }
}
