https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/

/*
 * 연속성없는 0과 1로 구성된 배열 만들 때 바꿔야 할 갯수
 * 0 or 1 로 구성된 배열이므로 11111 -> 01010 or 10101 이 되려면 3(5-2) / 2(5-3)
 * 즉 2개의 경우의 수가 있으며, 이 중 작은 값을 찾아야 하며,
 * 한개의 경우의 수를 찾으면 배열의 길이 - 한개의 경우의 수로 나머지 경우의 수를 구할 수 있음
 */

class Solution {
    public int minOperations(String s) {
        
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            cnt = s.charAt(i) == '0' + i % 2? cnt+1 : cnt;
        }
        
        return Math.min(cnt, s.length() - cnt);
    }
}
