https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

class Solution {
    public int findLucky(int[] arr) {

        int ans = -1;
        int[] frequency = new int[501];

        for(int i : arr){
            frequency[i]++;
        }

        for(int i = 1; i < frequency.length; i++) {
            if(frequency[i] == i) ans = i;
        }

        return ans;
    }
}
