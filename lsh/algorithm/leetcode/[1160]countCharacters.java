https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/

class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        int[] arr = new int[26];
        for(char c : chars.toCharArray()){
            arr[c-'a']++;
        }

        for(String s : words){
            int[] tmp = arr.clone();
            for(char c : s.toCharArray()){
                if(--tmp[c-'a'] < 0){
                    ans -= s.length();
                    break;
                }
            }
            ans += s.length();
        }

        return ans;
    }
}
