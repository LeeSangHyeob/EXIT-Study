https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int i = 0;

        while(c1.length + c2.length > sb.length()){
            if(c1.length > i) sb.append(c1[i]);
            if(c2.length > i) sb.append(c2[i]);
            i++;
        }

        return sb.toString();
    }
}
