https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int ans = 0;
		int idx = 0;
		int[] list = new int[n * (n + 1) / 2];
		
		for(int i = 0; i < n; i++) {
			list[idx++] = nums[i];
			for(int j = i + 1; j < n; j++) {
				list[idx] = list[idx++-1] + nums[j];
			}
		}
		
		Arrays.sort(list);
		
		for(int i = left-1; i < right; i++ ) {
			ans = (ans + list[i])%1000000007;
		}
		
		return ans;
    }
}
