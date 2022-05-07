https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/

class Solution {
    public long getDescentPeriods(int[] prices) {
        long cnt = 0;
        long ans = prices.length;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i - 1] - prices[i] == 1) {
                cnt++;
            } else {
                ans += (1 + cnt) * cnt / 2;
                cnt = 0;
            }
        }
        
        return ans + (1 + cnt) * cnt / 2;
    }
}
