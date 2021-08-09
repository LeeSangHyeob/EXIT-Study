https://leetcode.com/problems/longest-palindrome/description/

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int cnt = 0;
        
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                cnt++;
            } else {
                set.add(c);
            }
        }
        
        if(set.isEmpty()) return cnt * 2;
        return cnt * 2 + 1;
    }
}
