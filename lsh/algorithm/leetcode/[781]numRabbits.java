https://leetcode.com/problems/rabbits-in-forest/description/

class Solution {
    public int numRabbits(int[] answers) {
        int[] arr = new int[1001];
        int ans = 0;

        for(int i : answers){
            arr[i]++;
        }

        for(int i = 0; i < arr.length; i++) {
            ans += arr[i] % (i+1) == 0 ?
            arr[i] / (i+1) * (i+1) : (arr[i] / (i+1)+1) * (i+1);
        }

        return ans;
    }
}
