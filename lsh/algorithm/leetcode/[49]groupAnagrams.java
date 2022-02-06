https://leetcode.com/problems/group-anagrams/description/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<List<String>>();
        
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            
            String tmp = String.valueOf(c);
            if(!map.containsKey(tmp)){
                map.put(tmp, new ArrayList<>());
            }
            map.get(tmp).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
