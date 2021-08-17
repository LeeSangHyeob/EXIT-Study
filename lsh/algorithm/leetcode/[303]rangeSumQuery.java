https://leetcode.com/problems/range-sum-query-immutable/description/

class NumArray {
    
    int[] arr = null;
    
    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i < right + 1; i++){
            sum += arr[i];
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
