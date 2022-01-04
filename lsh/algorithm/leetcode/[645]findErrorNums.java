https://leetcode.com/problems/set-mismatch/description/

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int val = (1 + nums.length) * nums.length / 2;
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                ans[0] = nums[i];
            } else {
                set.add(nums[i]);
            }
            val -= nums[i];
        }
        
        ans[1] = ans[0] + val;
        return ans;
    }
}
