https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int size = s.length();
        int idx = 0;

        for(String str : words){
            if(!s.startsWith(str)) return false;
            idx = str.length();
            s = s.substring(idx);
            if(s.length() == 0) return true;
        }

        return s.length() == 0;
    }
}
