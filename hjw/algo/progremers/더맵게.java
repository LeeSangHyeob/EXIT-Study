import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int sc : scoville) {
            pq.add(sc);
        }
        
        int answer = 0;
        while(pq.peek() < K) {
            if(pq.size() <= 1) return -1;
            int o = pq.poll();
            int t = pq.poll();
            pq.add(o+t*2);
            answer++;
        }
        return answer;
    }
}
