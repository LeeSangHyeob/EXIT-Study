https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;

        for(String s : words){
            if(s.startsWith(pref)) cnt++;
        }

        return cnt;
    }
}
