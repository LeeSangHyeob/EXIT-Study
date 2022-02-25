https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        int cnt = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                cnt++;
            } else {
                ans = ans >= cnt? ans : cnt;
                cnt = 1;
            }
        }
        
        return Math.max(ans, cnt);
    }
}
