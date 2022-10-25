https://leetcode.com/problems/power-of-two/description/

class Solution {
    public boolean isPowerOfTwo(int n) {
        //if(n < 1) return false;
        //return (n & n-1) == 0;
        
        // 8 1000
        // 7 0111
        // 7&8 = 0000
        return n >= 1 && ((n & n-1) == 0);
        
    }
}
