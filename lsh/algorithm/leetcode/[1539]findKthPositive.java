https://leetcode.com/problems/kth-missing-positive-number/description/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + cnt + 1) cnt = arr[i] - i - 1;
            if(cnt >= k){
                return arr[i] - cnt + k - 1;
            }
        }
        
        return arr[arr.length - 1] + k - cnt;
    }
}
