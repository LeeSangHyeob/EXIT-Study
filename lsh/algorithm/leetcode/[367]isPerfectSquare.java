https://leetcode.com/problems/valid-perfect-square/description/

class Solution {
    public boolean isPerfectSquare(int num) {
        //return 0 == (double)Math.sqrt(num) % 1;
        
        long low = 1;
        long high = num;
        
        while ( low <= high ){
            long mid = (low + high) / 2;
            
            if(mid * mid == num) return true;
            else if(mid * mid < num) low = mid + 1;
            else if(mid * mid > num) high = mid - 1;
        }
        
        return false;
    }
}
