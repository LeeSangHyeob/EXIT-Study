https://leetcode.com/problems/fair-candy-swap/description/

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : bobSizes) {
            set.add(i);
            sum += i;
        }
        
        for(int i : aliceSizes) {
            sum -= i;
        }
        
        sum /= 2;
        
        for(int i : aliceSizes) {
            if(set.contains(i + sum)) return new int[]{i, i + sum};
        }
        
        return null;
    }
}
