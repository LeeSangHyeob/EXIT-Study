

public static int solution(int[] scoville, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i : scoville) {
			pq.offer(i);
		}
		
		int cnt = 0;
		while (pq.peek() < k) {
			if(pq.size() <= 1) return -1;
			int a = pq.poll();
			int b = pq.poll();
			pq.add(a + b * 2);
			cnt++;
		}
		return cnt;
	}
