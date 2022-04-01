https://leetcode.com/problems/integer-break/description/

class Solution {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        } else if(n % 3 == 1) {
            return (int)(Math.pow(3, (n / 3) - 1) * 4);
        } else if( n % 3 == 2) {
            return (int)(Math.pow(3, n / 3) * 2);
        } else {
            return (int)(Math.pow(3, n / 3));
        }
    }
}
