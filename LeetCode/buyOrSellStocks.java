class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], profit=0;
        for(int i=0; i<prices.length; i++){
            int sell=prices[i]-min;
            profit=Math.max(profit, sell);
            min=Math.min(min, prices[i]);
        }
        return profit;
    }
}