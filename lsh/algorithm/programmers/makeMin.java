https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int ans = 0;
        for(int i = 0; i < A.length; i++) {
            ans += A[i] * B[B.length - i - 1];
        }
        
        return ans;
    }
}
