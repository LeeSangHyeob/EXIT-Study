https://school.programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        boolean flag = true;
        for(char c : s.toCharArray()) {
            if(c == ' '){
                flag = true;
                sb.append(c);
            } else if(flag == true) {
                sb.append(String.valueOf(c).toUpperCase());
                flag = false;
            } else {
                sb.append(String.valueOf(c).toLowerCase());
            }
        }
        
        return sb.toString();
    }
}
