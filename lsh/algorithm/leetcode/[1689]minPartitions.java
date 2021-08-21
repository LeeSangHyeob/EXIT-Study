https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/

class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(char c : n.toCharArray()){
            ans = c - 48 > ans ? c - 48 : ans;
        }
        
        return ans;
    }
}
