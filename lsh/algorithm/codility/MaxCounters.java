https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/start/

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] ans = new int[N];
        int max = 0;
        int currMax = 0;
        for(int i : A){
            if(i > N){
                currMax = max;
            } else {
                ans[i-1] = ans[i-1] > currMax? ans[i-1] + 1 : currMax + 1;
                max = max > ans[i-1]? max : ans[i-1];
            }
        }
        
        for(int i = 0; i < N; i++){
            ans[i] = currMax > ans[i]? currMax : ans[i];
        }

        return ans;
    }
}
