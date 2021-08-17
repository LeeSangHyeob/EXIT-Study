https://leetcode.com/problems/different-ways-to-add-parentheses/description/

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == '+'
              || expression.charAt(i) == '-' 
              || expression.charAt(i) == '*'){
                String str1 = expression.substring(0, i);
                String str2 = expression.substring(i + 1);
                
                List<Integer> str1List = diffWaysToCompute(str1);
                List<Integer> str2List = diffWaysToCompute(str2);
                
                for(int j : str1List){
                    for(int k : str2List){
                        switch(expression.charAt(i)){
                            case '+':
                                list.add(j + k);
                                break;
                            case '-':
                                list.add(j - k);
                                break;
                            case '*':
                                list.add(j * k);
                                break;
                        }
                    }
                }
            }
        }
        
        if(list.size() == 0) list.add(Integer.valueOf(expression));
        return list;
    }
}
