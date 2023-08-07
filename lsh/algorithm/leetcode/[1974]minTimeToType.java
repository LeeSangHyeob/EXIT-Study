https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/description/

class Solution {
    public int minTimeToType(String word) {
        char a = 'a';
        int ans = 0;

        for(char c : word.toCharArray()){
            ans += c-a >= 13? 26-c+a : c-a <= -13? 26+c-a : Math.abs(c-a);
            a = c;
        }

        return ans + word.length();
    }
}
