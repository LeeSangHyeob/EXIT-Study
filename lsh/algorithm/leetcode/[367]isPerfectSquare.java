https://leetcode.com/problems/valid-perfect-square/description/

class Solution {
    public boolean isPerfectSquare(int num) {
        return 0 == (double)Math.sqrt(num) % 1;
    }
}
