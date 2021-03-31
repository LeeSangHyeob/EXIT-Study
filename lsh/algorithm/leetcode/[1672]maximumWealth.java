https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public static int maximumWealth(int[][] accounts) {
		
		int max = 0;
		//for(int i = 0; i < accounts.length; i++) {
		for(int[] i: accounts) {
			int sum = 0;
			for(int j : i) {
				sum += j;
			}
			if(max < sum) {
				max = sum;
			}
		}		
		return max;
	}
}
