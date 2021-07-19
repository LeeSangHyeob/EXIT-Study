https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        /*
         * 맨 앞 + index 과 맨 뒤 - index 의 char 교환
         * tmp : 바꿀 문자 임시 저장 변수
         * 배열의 길이가 홀수일 때, 마지막 교환은 처리하지 않아도 됨
         */
        int len = s.length;
		for(int i = 0; i < len / 2; i++) {
			char tmp = s[i];
			s[i] = s[len-i-1];
			s[len-i-1] = tmp;
		}
    }
}
