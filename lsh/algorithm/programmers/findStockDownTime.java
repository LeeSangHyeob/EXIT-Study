https://programmers.co.kr/learn/courses/30/lessons/42584

public class findStockDownTime {
  
	public static int[] solution(int[] prices) {
		int[] ans = new int[prices.length];
		int cnt = 0;
		
		for(int i = 0; i < prices.length - 1; i++) {
			cnt = 0;
			for(int j = i + 1; j < prices.length; j++) {
				cnt++;
				if(prices[i] <= prices[j]) {
					continue;
				} else {
					break;
				}
			}
			ans[i] = cnt;
		}
		ans[prices.length-1] = 0;
		
		return ans;
	}

}
