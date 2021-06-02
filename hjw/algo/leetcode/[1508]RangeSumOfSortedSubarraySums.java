class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> ls = new ArrayList<>();
        int size = nums.length;
        int mod = (int)(1e9+7);
        for(int i=0;i<size;i++) {
            int sum = 0;
            for(int j=i;j<size;j++) {
                sum += nums[j];
                ls.add(sum);
            }
        }
        Collections.sort(ls);
        int rs = 0;
        for(int i=left-1;i<right;i++) {
            rs=(rs+ls.get(i))%mod;
            
        }
        return rs;
    }
}
