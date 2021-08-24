https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(nums);
        
        return nums;
        */
        
        int[] ans = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        
        for(int i = high; i >= 0; i--){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                ans[i] = nums[low] * nums[low];
                low++;
            } else {
                ans[i] = nums[high] * nums[high];
                high--;
            }
        }
        
        return ans;
    }
}
