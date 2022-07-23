https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        
        for(String s : operations) {
            if(s.startsWith("+") || s.endsWith("+")) ans++;
            else ans--;
        }
        
        return ans;
    }
}
