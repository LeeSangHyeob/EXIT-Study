https://programmers.co.kr/learn/courses/30/lessons/42578

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int ans = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes){
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }
        
        for(String s : map.keySet()){
            ans *= map.get(s) + 1;
        }
        
        return ans - 1;
    }
}
