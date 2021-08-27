https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/start/

import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] ans = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int currMax = 0;
        for(int i : A){
            if(i > N){
                currMax = max;
                ans = new int[N];
            } else {
                ans[i-1]++;
                map.put(i, map.getOrDefault(i, 0) + 1);
                max = max > map.get(i)? max : map.get(i);
            }
        }

        for(int i = 0; i < N; i++){
            ans[i] += currMax;
        }

        return ans;
    }
}
