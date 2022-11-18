https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int ans = 0;
        for(int i = cost.length-1; i >= 0; i -= 3) {
            if(i < 3 && (i+1) % 3 == 1){
                ans += cost[i];
            } else {
                ans += cost[i] + cost[i-1];
            }
        }

        return ans;
    }
}
