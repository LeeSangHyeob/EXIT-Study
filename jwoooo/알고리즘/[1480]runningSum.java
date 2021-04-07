class Solution {
    public int[] runningSum(int[] nums) {
        
        int temp = 0;
        int[] result = new int[nums.length];
        
        for(int i =0; i < nums.length; i++) {
            for(int j=0; j< i+1; j++) {
                temp = temp + nums[j];
            }
            result[i] = temp;
            temp = 0;
        }
        return result;
    }
}
