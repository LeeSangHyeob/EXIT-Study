https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        
        int max = 0;
        int val = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                i = map.get(s.charAt(i));
                max = max > val? max : val;
                map.clear();
                val = 0;
            } else {
                map.put(s.charAt(i), i);
                val++;
            }
        }
        return max > val? max : val;
    }
}
