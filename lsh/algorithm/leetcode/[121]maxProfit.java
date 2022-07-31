https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        
        for(int i = 1; i < prices.length; i++){
            min = min < prices[i]? min : prices[i];
            ans = ans < prices[i] - min? prices[i] - min : ans;
        }
        
        return ans;
    }
}
