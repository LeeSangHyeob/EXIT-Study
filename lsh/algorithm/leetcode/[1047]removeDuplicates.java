https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

class Solution {
    public String removeDuplicates(String s) {
        Stack stack = new Stack();
        
        for(Character c : s.toCharArray()) {
            if(stack.size() != 0 && stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        
        StringBuffer sb = new StringBuffer();
        
        while(stack.size() != 0) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}
