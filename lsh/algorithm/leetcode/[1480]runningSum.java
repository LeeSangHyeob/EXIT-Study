https://leetcode.com/problems/running-sum-of-1d-array/

public static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		int size = nums.length;
		ans[0] = nums[0];
		
		for(int i = 1; i < size; i++) {
			ans[i] = ans[i-1] + nums[i];
		}
		
		return ans;
}
