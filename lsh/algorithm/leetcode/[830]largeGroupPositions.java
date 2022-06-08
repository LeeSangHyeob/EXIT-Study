https://leetcode.com/problems/positions-of-large-groups/description/

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int pt = 0;
        
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(pt)) {
                if (i - pt >= 3) {
                    ans.add(Arrays.asList(pt, i - 1));
                }
                pt = i;
            }
        }
        return ans;
    }
}
