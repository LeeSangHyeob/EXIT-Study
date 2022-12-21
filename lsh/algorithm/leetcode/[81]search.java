https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

class Solution {
    public boolean search(int[] nums, int target) {
        for(int num : nums) {
            if(num == target) return true;
            //if(num > target ) return false;
        }

        return false;
    }
}
