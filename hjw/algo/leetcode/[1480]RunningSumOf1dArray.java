class Solution {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        for(int i=1;i<size;i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
