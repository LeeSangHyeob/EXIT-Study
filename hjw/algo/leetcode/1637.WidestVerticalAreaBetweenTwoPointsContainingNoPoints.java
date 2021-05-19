class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
       /*
        Set<Integer> hs = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] p : points) {
            hs.add(p[0]);
        }
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            pq.add( it.next());
        }
        int max = 0;
        while(pq.size() != 1) {
            int t1 = pq.poll();
            int t2 = pq.poll();
            int calc = t2-t1;
            if(max < calc) max = calc;
            pq.add(t2);
        }
        return max;
        */
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        
        int max = 0;
        for (int i = 0; i < points.length - 1; i++) {
            max = Integer.max(points[i+1][0] - points[i][0], max);
        }
        return max;
    }
}
