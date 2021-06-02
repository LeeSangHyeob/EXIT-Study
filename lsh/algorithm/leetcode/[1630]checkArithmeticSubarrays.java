https://leetcode.com/problems/arithmetic-subarrays/

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++) {
            boolean isCheck = true;
        	int[] tmp = nums.clone();
        	int left = l[i];
        	int right = r[i];
        	Arrays.sort(tmp, left, right + 1);
        	
        	int val = tmp[left+1] - tmp[left];
        	
        	for(int j = left + 1; j < right; j++) {
        		if(tmp[j] + val != tmp[j+1]) {
        			isCheck = false;
        			break;
        		}
        	}
        	ans.add(isCheck);
        }
        return ans;
    }
}
