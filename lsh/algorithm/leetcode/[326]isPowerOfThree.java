https://leetcode.com/problems/power-of-three/

/* 
 * 3의 제곱인지 판단하는 로직
 * n은 음수가 가능한 int 범위 내
 * int는 정수이며,
 * 3의 마이너스 제곱은 분수로 int 의 범위가 아님
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        if( n == 1) return true;
		else if(n <= 0 || n % 3 != 0) return false;
		return isPowerOfThree(n / 3);
    }
}
