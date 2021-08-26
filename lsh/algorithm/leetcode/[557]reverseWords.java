https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(reverse(s.substring(idx , i)));
                sb.append(" ");
                idx = i + 1;
            }
        }
        
        sb.append(reverse(s.substring(idx)));
        
        return sb.toString();
    }
    
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        
        int len = s.length();
        
        for(int i = len; i > 0; i--){
            sb.append(s.charAt(i - 1));
        }
        return sb.toString();
    }
}
