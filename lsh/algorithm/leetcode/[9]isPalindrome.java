https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        int len = str.length();
        int left = 0;
        int right = 0;
        
        if(len % 2 == 0) {
            left = len /2 - 1;
            right = len /2;
        } else {
            left = len / 2;
            right = len / 2;
            len++;
        }
        
        for(int i = 0; i < len / 2; i++) {
            if(str.charAt(left-i) != str.charAt(right+i)) return false;
        }
        
        return true;
    }
}
