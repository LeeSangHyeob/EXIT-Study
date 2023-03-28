https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();

        int ans = 0;

        for(String s : tokens){
            if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();

                switch(s) {
                    case "+":
                        ans = val2 + val1;
                        break;
                    case "-":
                        ans = val2 - val1;
                        break;
                    case "*":
                        ans = val2 * val1;
                        break;
                    case "/":
                        ans = val2 / val1;
                        break;
                }

                st.push(ans);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}
