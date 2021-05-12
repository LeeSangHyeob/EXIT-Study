class Solution {
    public int findJudge(int n, int[][] trust) {
        /*
        Map<Integer,Integer> hm = new HashMap<>();
        Set<Integer> hs = new HashSet<>();
        for(int[] t : trust) {
            hs.add(t[0]);
            hm.put(t[1],hm.getOrDefault(t[1],0)+1);
        }
        for(int i=1;i<=n;i++) {
            if(hm.getOrDefault(i,0) == (n-1) && !hs.contains(i)) return i;
        }
        return -1;
        */
        int[] tmp = new int[n+1];
        for(int[] t : trust) {
            tmp[t[0]]--;
            tmp[t[1]]++;
        }
        
        for(int i=1;i<=n;i++) {
            if(tmp[i] == n-1) return i;
        }
        return -1;
    }
}
