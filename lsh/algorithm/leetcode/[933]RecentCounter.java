https://leetcode.com/problems/number-of-recent-calls/

class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();
	
	public RecentCounter() {
		
    }
    
    public int ping(int t) {
    	queue.offer(t);
    	while (queue.peek() < t - 3000) {
    		queue.poll();
    	}
    	return queue.size();
    }
}
