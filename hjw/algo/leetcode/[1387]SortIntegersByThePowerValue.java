class Solution {
    public int getKth(int lo, int hi, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[1] < b[1]) return -1;
            else if(a[1] > b[1]) return 1;
            else {
                if(a[0] < b[0]) return -1;
                else if(a[0] > b[0]) return 1;
                return 0;
            }
        });
        
        for(int i =lo;i<=hi;i++) {
            int[] tmp = new int[2];
            tmp[0] = i;
            tmp[1] = calc(i);
            pq.add(tmp);
        }
        
        for(int i=0;i<k-1;i++) pq.poll();
        
        return pq.poll()[0];    
        
    }
    
    public int calc(int t) {
        int cnt = 1;
        while(t != 1) {
            if(t%2 == 0) t = t/2;
            else t = t*3+1;
            cnt++;
        }
        
        return cnt;
    }
    
}
