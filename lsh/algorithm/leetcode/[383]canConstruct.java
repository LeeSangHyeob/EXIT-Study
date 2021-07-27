https://leetcode.com/problems/ransom-note/description/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        boolean ans = false;
        for(int i = 0; i < ransomNote.length(); i++){
            map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
            if(map.get(magazine.charAt(i)) == 1){
                map.remove(magazine.charAt(i));
            } else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) - 1);
            }
            
            if(map.size() == 0) {
                ans = true;
                break;
            }
        }
        }
        
        return ans;
    }
}
