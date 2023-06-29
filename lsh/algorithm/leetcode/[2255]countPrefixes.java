https://leetcode.com/problems/count-prefixes-of-a-given-string/description/

class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;

        for(String str : words){
            if(s.startsWith(str)) cnt++;
        }

        return cnt;
    }
}
