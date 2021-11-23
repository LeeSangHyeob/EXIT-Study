https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int cnt = 0;
        for(int i : nums){
            if(i == 1){
                cnt++;
            } else {
                ans = ans > cnt? ans : cnt;
                cnt = 0;
            }
        }
        
        return Math.max(ans, cnt);
    }
}
