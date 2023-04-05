https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char c1, c2;

        s = s.toLowerCase();

        while (left <= right) {
            c1 = s.charAt(left);
            c2 = s.charAt(right);
            if(!Character.isLetterOrDigit(c1)) {
                left++;
            } else if(!Character.isLetterOrDigit(c2))  {
                right--;
            } else {
                if(c1 != c2) { return false;}
                left++;
                right--;
            }
        }

        return true;

    }
}
