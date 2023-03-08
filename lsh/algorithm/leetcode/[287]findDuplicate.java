https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)) return i;
            set.add(i);
        }

        return -1;
    }
}
