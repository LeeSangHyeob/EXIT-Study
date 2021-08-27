https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/start/

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if(A == B) return B % K == 0? 1 : 0;
        while (A % K != 0) {
            A++;
        }

        return (B-A) / K + 1;
    }
}

