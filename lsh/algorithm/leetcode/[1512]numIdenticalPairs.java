https://leetcode.com/problems/number-of-good-pairs/description/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        // 2 - 1 3 - 3 4 - 6 5 - 10
        // (1 + 1) * 1 / 2 || (1 + 2) * 2 / 2 || (1 + 3) * 3 / 2
        int ans = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.keySet()){
            int val = map.get(i);
            if(val > 1){
                ans += val * (val-1) / 2;
            }
        }
        
        return ans;
    }
}
