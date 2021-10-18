https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        /*
		 *  n * m 의 골목이 있을 때
		 *  (0,0) -> (m,n) 까지의 경로의 수
		 *  배열 선언하여 마지막 배열의 값 추력
		 */
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == 0 || j == 0){
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
				
			}
		}
		
		return arr[n-1][m-1];
    }
}
