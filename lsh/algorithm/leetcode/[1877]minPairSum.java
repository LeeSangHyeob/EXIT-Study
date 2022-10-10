https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int ans = 0;
        int len = nums.length;
        int left = len / 2 - 1;
        int right = len / 2;
        
        for(int i = 0; i < len / 2; i++) {
            ans = Math.max(ans, nums[left - i] + nums[right + i]);
        }
        
        return ans;
    }
}
