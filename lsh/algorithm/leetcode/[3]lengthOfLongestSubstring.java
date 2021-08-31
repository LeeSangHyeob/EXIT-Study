https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
//         if(s.length() < 2) return s.length();
        
//         int max = 0;
//         int val = 0;
//         Map<Character, Integer> map = new HashMap<>();
        
//         for(int i = 0 ; i < s.length(); i++){
//             if(map.containsKey(s.charAt(i))){
//                 i = map.get(s.charAt(i));
//                 max = max > val? max : val;
//                 map.clear();
//                 val = 0;
//             } else {
//                 map.put(s.charAt(i), i);
//                 val++;
//             }
//         }
//         return max > val? max : val;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                i = map.get(s.charAt(i));
                max = max > map.size()? max : map.size();
                map.clear();
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return max > map.size()? max : map.size();
        
        
//         int i = 0, j = 0, max = 0;
//         Set<Character> set = new HashSet<>();

//         while (j < s.length()) {
//             if (!set.contains(s.charAt(j))) {
//                 set.add(s.charAt(j++));
//                 max = Math.max(max, set.size());
//             } else {
//                 set.remove(s.charAt(i++));
//             }
//         }

//         return max;
    }
}
