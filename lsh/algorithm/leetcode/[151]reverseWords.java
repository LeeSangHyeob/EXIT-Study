https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        System.out.println(s.trim());
        String[] arr = s.split(" ");
        
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length; i > 0; i--) {
            if(!arr[i-1].isEmpty()) {
                sb.append(arr[i-1]).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
