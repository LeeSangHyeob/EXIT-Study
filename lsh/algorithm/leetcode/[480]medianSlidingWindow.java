https://leetcode.com/problems/sliding-window-median/description/

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ans = new double[nums.length - k + 1];
        
        for(int i = 0; i < nums.length - k + 1; i++){
            int[] tmp = Arrays.copyOfRange(nums, i , i + k);
            Arrays.sort(tmp);
            
            if (k % 2 == 0) {
                ans[i] = ((double)tmp[k / 2 - 1] + (double)tmp[k / 2]) / 2;
            } else {
                ans[i] = tmp[k / 2];
            }
        }
        
        return ans;
    }
}
