https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/submissions/

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return typeCast(firstWord) + typeCast(secondWord) == typeCast(targetWord);
    }
    
    public static int typeCast(String str) {
		char[] arr = str.toCharArray();
		int ans = 0;
		int idx = arr.length - 1;
		int factor = 1;
		for(int i = idx; i >= 0; i--) {
			ans += (arr[i] - 'a') * factor;
			factor *= 10;
		}
		return ans;
	}
}
