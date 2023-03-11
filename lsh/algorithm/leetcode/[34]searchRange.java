https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min = -1;
        int max = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(min == -1) {
                    min = i;
                    max = i;
                } else {
                    max = i;
                }
            } else if(nums[i] > target) break;
        }

        return new int[]{min, max};
    }
}

