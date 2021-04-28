import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Queue<Stock> q = new LinkedList<>();
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
            int size = q.size();
            for(int j=0;j<size;j++) {
                Stock s = q.poll();
                s.time++;
                if(prices[s.idx] > prices[i]) answer[s.idx] = s.time;
                else q.add(s);
            }
            Stock tmp = new Stock(i,0);
            q.add(tmp);
        }
        
        while(!q.isEmpty()) {
            Stock s = q.poll();
            answer[s.idx] = s.time;
        }
        return answer;
    }
}

class Stock {
    int idx;
    int time;
    public Stock(int idx,int time) {
        this.idx = idx;
        this.time = time;
    }
}
