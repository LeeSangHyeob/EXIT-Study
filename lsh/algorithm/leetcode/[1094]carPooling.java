https://leetcode.com/problems/car-pooling/description/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] list = new int[1001];
        int max = 0;

        for(int[] arr : trips){
            for(int i = arr[1]; i < arr[2]; i++) {
                list[i] += arr[0];
                max = list[i] > max? list[i] : max;
            }
        }

        return max <= capacity;
    }
}
