https://leetcode.com/problems/count-binary-substrings/description/

class Solution {
    public int countBinarySubstrings(String s) {
        int tmp = 0;
        int cnt = 1;
        int ans = 0;
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                if(tmp != 0){
                    ans += tmp > cnt? cnt : tmp;
                }
                tmp = cnt;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        ans += tmp > cnt? cnt : tmp;
        return ans;
    }
}
