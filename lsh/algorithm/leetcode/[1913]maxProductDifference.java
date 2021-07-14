https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
/*
 * 큰 두개의 곱 - 작은 두개의 곱
 */
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] * nums[nums.length-2] - nums[0] * nums[1];
    }
}
