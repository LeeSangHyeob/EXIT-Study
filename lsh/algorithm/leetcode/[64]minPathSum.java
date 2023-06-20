https://leetcode.com/problems/minimum-path-sum/description/

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j != 0) grid[i][j] += grid[i][j-1];
                else if(i != 0 && j == 0) grid[i][j] += grid[i-1][j];
                else if(i != 0 && j != 0) grid[i][j] += grid[i-1][j] < grid[i][j-1]? grid[i-1][j] : grid[i][j-1];
            }
        }

        return grid[m-1][n-1];
    }
}
