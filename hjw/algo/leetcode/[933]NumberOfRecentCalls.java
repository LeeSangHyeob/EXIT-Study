class RecentCounter {

    Queue<Integer> q;
    public RecentCounter() {
        this.q = new LinkedList<>();
    }
    
    public int ping(int t) {
        int size = q.size();
        if(size < 1) {
            q.add(t);
            size++;
        } else {
            q.add(t);
            int cnt = 0;
            while(q.peek() < t-3000) {
                cnt++;
                q.poll();
            }
            size = size-cnt+1;
        }
        return size;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
