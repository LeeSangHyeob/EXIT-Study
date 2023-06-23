https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) nums[i+1] = nums[i];
            else return nums[i+1];
        }

        return nums[nums.length-1];
    }
}
