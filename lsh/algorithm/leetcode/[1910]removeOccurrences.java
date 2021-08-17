https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        
        return s;
    }
}
