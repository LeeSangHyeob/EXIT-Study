https://leetcode.com/problems/word-pattern/description/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        
        Map<Character, String> map = new HashMap<>();
        if(pattern.length() != arr.length) return false;
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if (!map.containsKey(c)){
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(c, arr[i]);
            } else if(map.get(c).equals(arr[i])) {
                continue;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
