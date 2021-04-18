https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/submissions/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
		
		int tmp = arr[1] - arr[0];
		for(int i = 1; i < arr.length-1; i++) {
			if(tmp != arr[i+1]-arr[i])
				return false;
		}
		return true;
    }
}
