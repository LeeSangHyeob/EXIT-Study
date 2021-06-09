https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/submissions/

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return typeCast(firstWord) + typeCast(secondWord) == typeCast(targetWord);
    }
    
    public int typeCast(String str) {
	int ans = 0;
	for(char c: str.toCharArray()) ans = ans * 10 + c - 'a';
	return ans;
    }
}
