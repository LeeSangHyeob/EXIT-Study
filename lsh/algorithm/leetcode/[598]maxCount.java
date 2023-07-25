https://leetcode.com/problems/range-addition-ii/description/

class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        if(ops.length == 0) return m * n;

        int xVal = Integer.MAX_VALUE;
        int yVal = Integer.MAX_VALUE;

        for(int[] i : ops){
            if(i[0] < xVal) xVal = i[0];
            if(i[1] < yVal) yVal = i[1];
        }

        return xVal * yVal;
    }
}
