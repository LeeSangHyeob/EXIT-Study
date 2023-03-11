https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) ans.add(i);
         }

         return ans.size() == 0? new ArrayList<Integer>() : ans;
    }
}
