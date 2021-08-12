https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = nums[ans] > nums[i]? ans : i;
        }
        
        return ans;
    }
}
