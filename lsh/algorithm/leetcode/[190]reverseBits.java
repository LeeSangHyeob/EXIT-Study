https://leetcode.com/problems/reverse-bits/description/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //return Integer.reverse(n);
        
        int ans = 0;
        for(int i=0; i<32; i++){
            ans = ans <<1;
            if((n & 1) >0){
                ans = ans | 1;
            }
            n = n >>1;
        }
        return ans;
    }
}
