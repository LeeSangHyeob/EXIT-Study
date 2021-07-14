https://leetcode.com/problems/product-of-array-except-self/

/*
 * 모든 nums 를 곱한 값을 통해
 * 해당 인덱스 값을 나누어 저장
 *
 * 예외처리 0
 * 0이 1개일 시 해당 인덱스 + 1을 cnt에 저장
 * 0이 2개 이상일 시 모두 0
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiply = 1;
        int cnt = 0;
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                multiply *= nums[i];
            } else {
                if(cnt != 0){
                    return ans;
                } else {
                    cnt = i + 1;
                }
            }
        }
        
        if(cnt != 0){
            ans[cnt-1] = multiply;
        } else {
            for(int i = 0; i < len; i++){
                ans[i] = multiply / nums[i];
            }
        }

        return ans;
    }
}
