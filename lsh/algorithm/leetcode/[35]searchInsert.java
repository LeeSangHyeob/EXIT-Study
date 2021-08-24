https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        
        while (start < end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] < target) start = mid + 1;
            else end = mid;
        }
        
        return start;
    }
}
