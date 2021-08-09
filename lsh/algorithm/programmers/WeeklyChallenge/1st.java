https://programmers.co.kr/learn/courses/30/lessons/82612

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
      
        answer = ((long)(price * count) * (1 + count) / 2) - money; // 곱하는 와중에 int범위를 벗어나면 안되기 때문에 최초 곱셈을 하면서 미리 형변환을 시킴
        return answer > 0? answer : 0;
    }
}
