https://leetcode.com/problems/max-increase-to-keep-city-skyline/

class Solution {
    
    // 해당 셀 가로 세로별 max 값중 작은 값에서 해당 셀 숫자를 뺀다
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        int rCnt = 0;
        int max = 0;
        int ans = 0;
        
        for(int[] arr : grid) {
            max = 0;
            
            for(int i = 0; i < arr.length; i++) {
                max = max < arr[i]? arr[i] : max;
                colMax[i] = colMax[i] < arr[i]? arr[i] : colMax[i];
            }
            
            rowMax[rCnt++] = max;
        }
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                ans += rowMax[j] < colMax[i]? rowMax[j] - grid[i][j] : colMax[i] - grid[i][j];
            }
        }
        
        return ans;
    }
}
