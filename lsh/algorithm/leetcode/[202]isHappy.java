https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = calc(slow);
            if(slow == 1) return true;
            fast = calc(fast);
            if(fast == 1) return true;
            fast = calc(fast);
            if(fast == 1) return true;
        } while(slow != fast);
        return false;
        
        // 1 or 7 이면 true ??
        // if(n == 1 || n == 7) return true;
        // else if(n < 10) return false;
        // int m = 0;
        // while(n != 0){
        //     int tail = n % 10;
        //     m += tail * tail;
        //     n = n/10;
        // }
        // return isHappy(m);
    }
    
    public int calc(int n){
        int sum = 0;
        int tmp = 0;
        while (n != 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}
