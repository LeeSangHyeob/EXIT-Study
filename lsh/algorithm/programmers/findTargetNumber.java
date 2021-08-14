https://programmers.co.kr/learn/courses/30/lessons/43165

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int depth, int sum){
        int ans = 0;
        
        if(depth == numbers.length){
            if(sum == target){
                return 1;
            } else {
                return 0;
            }
        }
        
        ans += dfs(numbers, target, depth + 1, sum + numbers[depth]);
        ans += dfs(numbers, target, depth + 1, sum - numbers[depth]);
        
        return ans;
    }
}
