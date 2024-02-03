https://school.programmers.co.kr/learn/courses/30/lessons/12939

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : arr) {
            int val = Integer.parseInt(str);
            max = max > val? max : val;
            min = min > val? val : min;
        }
        
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}
