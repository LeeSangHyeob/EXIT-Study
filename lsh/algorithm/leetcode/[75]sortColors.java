https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        int idx = 0;
        int cnt = 0;
        
        for(int num : nums) {
            colors[num]++;
        }
        
        while (cnt < nums.length) {
            while(colors[idx] <= 0) idx++;       nums[cnt++] = idx;
            colors[idx]--;
            
        }
    }
}
