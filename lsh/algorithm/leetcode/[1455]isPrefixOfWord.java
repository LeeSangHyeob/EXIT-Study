https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");

        for(int i = 0; i < s.length; i++){
            if(s[i].startsWith(searchWord)) return i+1;
        }

        return -1;
    }
}
