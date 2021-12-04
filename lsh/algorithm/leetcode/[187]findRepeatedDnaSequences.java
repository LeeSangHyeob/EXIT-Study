https://leetcode.com/problems/repeated-dna-sequences/description/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i <= s.length() - 10; i++){
            String str = s.substring(i, i + 10);
            
            if(!map.containsKey(str)){
                map.put(str, 1);
            } else {
                if(map.get(str) == 1){
                    map.put(str, 2);
                    ans.add(str);
                }
            }
        }
        
        return ans;
    }
}
