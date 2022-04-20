https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int val = 0;
        boolean chk = nums[nums.length - 1] - nums[0] > 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            val = nums[i+1] - nums[i];
            if(val != 0 && (val > 0) != chk) return false;
        }
        
        return true;
    }
}
