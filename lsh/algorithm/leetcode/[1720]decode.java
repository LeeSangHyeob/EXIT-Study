https://leetcode.com/problems/decode-xored-array/

class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decode = new int[encoded.length + 1];
		int cnt = 1;
		decode[0] = first;
		
		for(int i : encoded) {
			decode[cnt] = i ^ decode[cnt++-1];
		}
		
		return decode;
    }
}
