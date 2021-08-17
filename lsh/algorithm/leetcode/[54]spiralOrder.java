https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        
        int x = matrix.length < matrix[0].length ? matrix.length : matrix[0].length;
        
        for(int i = 0; i < x / 2 + 1; i++){
            dfs(matrix, i);
        }
        
        return list;
    }
    
    public void dfs(int[][] matrix, int cnt){
        int x = matrix[0].length - cnt;
        int y = matrix.length - cnt;

        if(y - 1 >= cnt){
            for(int i = 0 + cnt; i < x; i++){
                list.add(matrix[cnt][i]);
            }
        }
        
        if(x - 1 >= cnt){
            for(int i = 1 + cnt; i < y; i++){
                list.add(matrix[i][x - 1]);
            }
        }
        
        if(y - 1 > cnt){
            for(int i = x - 1; i > cnt; i--){
                list.add(matrix[y - 1][i - 1]);
            }
        }
        
        if(x - 1 > cnt){
            for(int i = y - 1; i > cnt + 1; i--){
                list.add(matrix[i - 1][cnt]);
            }
        }
    }
}
