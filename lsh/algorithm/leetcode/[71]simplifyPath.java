https://leetcode.com/problems/simplify-path/description/

class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        
        String ans = "";
        
        for(String s : path.split("/")){
            if(s.equals("..")) {
                if(!stack.empty()) stack.pop();
            }
            else if(s.equals(".") || s.equals("")) continue;
            else stack.push(s);
        }
        for(String s : stack){
            if(!s.equals("")) ans += "/" + s;
        }
        
        return ans.equals("")? "/" : ans;
    }
}
