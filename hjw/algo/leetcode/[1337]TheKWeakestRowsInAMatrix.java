class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[1] > b[1]) return 1;
            else if(a[1] < b[1]) return -1;
            else {
                if(a[0] > b[0]) return 1;
                else if(a[0] < b[0]) return -1;
                return 0;
            }
        });
        
        int idx = 0;
        for(int[] t : mat) {
            int[] tmp = new int[2];
            tmp[0] = idx++;
            tmp[1] = bs(t);
            /*
            for(int t1 : t) {
                if(t1 == 0) break;
                tmp[1]++;
            } 
            */
            pq.add(tmp);
        }
        
        int[] rs = new int[k];
        for(int i=0;i<k;i++) {
            rs[i] = pq.poll()[0];
        }
        
        return rs;
    }   
    
    public int bs(int[] arr) {
        int size = arr.length;
        int idx = size/2;
        int scale = size/2;
        while(true) {
            if(idx > 0) {
                if( idx >= size) return idx;
                else if(arr[idx] == 0 && arr[idx-1] == 1) return idx;
                else {
                    if(arr[idx] == 1) {
                        int d = scale/2;
                        if(d == 0) d =1;
                        idx += d;
                    } else {
                        int d = scale/2;
                        if(d == 0) d =1;
                        idx -= d;
                    }
                    scale/=2;
                }
            } else {
                return 0;
            }
        }
    }
}
