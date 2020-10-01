/*BEST TIME TO BUY AND SELL STOCK */

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 1)
        {
            return 0;
        }
        int profit=0,b=prices[0];
        for(int p : prices)
        {
            if(p <= b)
            {
                b = p;
            }
            else if(p - b > profit)
            {
                profit = p - b;
            }
        }
        return profit;
    }
}