class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] t : accounts) {
            int sum = 0;
            for(int t2 : t) {
                sum += t2;
            }
            max = max < sum ? sum : max;
        }
        return max;
    }
}
