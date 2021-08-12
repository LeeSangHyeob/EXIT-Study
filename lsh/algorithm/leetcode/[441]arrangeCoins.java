https://leetcode.com/problems/arranging-coins/description/

class Solution {
    public int arrangeCoins(int n) {
        int ans = -1;
        for(int i = 1; n >= 0; i++){
            n -= i;
            ans++;
        }
        
        return ans;
    }
}
