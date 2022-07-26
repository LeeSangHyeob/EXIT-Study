https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        for(int i = 0; i < t.length(); i++){
            idx = s.charAt(idx) == t.charAt(i) ? idx + 1 : idx;
            if(idx >= s.length()) return true;
        }
    return false;
    }  
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int idx = 0;
        for(char c : t.toCharArray()) {
            if(c == s.charAt(idx)) idx++;
            if(idx == s.length()) return true;
        }
        return false;
    }
}
