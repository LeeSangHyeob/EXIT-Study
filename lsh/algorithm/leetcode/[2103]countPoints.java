https://leetcode.com/problems/rings-and-rods/

class Solution {
    public int countPoints(String rings) {
        int ans = 0;
        Map<Character, Set<Character>> map = new HashMap<>();
        char[] arr = rings.toCharArray();
        
        for(int i = 1; i < arr.length; i+=2) {
            Set<Character> set = map.getOrDefault(arr[i], new HashSet<>());
            set.add(arr[i-1]);
            map.put(arr[i], set);
        }
        
        for(char key : map.keySet()){
            if(map.get(key).size() == 3) ans++;
        }
        
        return ans;
    }
}
