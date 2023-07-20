https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;

        int[] arr = new int[gain.length+1];

        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1] + gain[i-1];
            ans = ans < arr[i]? arr[i] : ans;
        }

        return ans;
    }
}
