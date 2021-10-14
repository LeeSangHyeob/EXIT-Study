https://leetcode.com/problems/unique-binary-search-trees/description/

import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        // 카탈란 수
        //https://m.blog.naver.com/pyw0564/221523147108
        //https://m.blog.daum.net/sualchi/13720448
        //(1) 모든 경우 수         = 2n C n = (2n)!/((2n-n)!*n!)
        //(2) 비정상 괄호 쌍 경우 수 = 2n C n+1 = (2n)!/((2n-n-1)!*(n+1)!)
        //(3) 정상 괄호 쌍 경우 수  = 모든 경우 - 비정상 경우 = (1)식 - (2)식 = (2*n)! / (n)! / (n+1)!
        BigInteger molecular = BigInteger.ONE;
    	BigInteger denominator = BigInteger.ONE;
        int num = 2 * n;
        
        for (int i = 1; i <= n; i++) {
            molecular = molecular.multiply(BigInteger.valueOf(num--)); // 분자 num - (num - n) 까지 곱함  -> num! - n! -> (3) 의 식에서 (n+1)!이 n+1로 됨
            denominator = denominator.multiply(BigInteger.valueOf(i));   // 분모 n!
        }
        return molecular.divide(denominator).divide(BigInteger.valueOf(n+1)).intValue();
    }
}
