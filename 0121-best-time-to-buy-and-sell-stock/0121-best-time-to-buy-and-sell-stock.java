class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {

            int CP = prices[i];

            
            if (CP > bestBuy) {
                profit = Math.max(profit, CP - bestBuy);
            }

            
            if (CP < bestBuy) {
                bestBuy = CP;
            }
        }

        return profit;
        
        
    }
}