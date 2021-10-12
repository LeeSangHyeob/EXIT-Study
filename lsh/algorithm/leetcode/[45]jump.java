https://leetcode.com/problems/jump-game-ii/description/

class Solution {
    public int jump(int[] nums) {
        int idx = 0;
        int n = 0;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = max > i + nums[i] ? max : i + nums[i];
            if (i == idx) {
                n++;
                idx = max;
            }
        }
	    return n;
    }
}
