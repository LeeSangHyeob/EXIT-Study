https://leetcode.com/problems/sort-integers-by-the-power-value/

class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] ans = new int[hi - lo + 1];
		
		for(int i = 0; i < ans.length; i++) {
			int cnt = 0;
			int j = lo + i;
			while(j != 1) {
				if(j % 2 == 1) {
					j = 3*j+1;
				} else {
					j /= 2;
				}
				cnt++;
			}
			ans[i] = cnt;
			
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : ans) {
			map.put(i, lo++);
		}
		Arrays.sort(ans);
		
		return map.get(ans[k-1]);
    }
}
