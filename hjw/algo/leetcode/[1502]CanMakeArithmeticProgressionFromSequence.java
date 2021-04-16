class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        int size = arr.length;
        for(int i=2;i<size;i++) {
            if(d != (arr[i]-arr[i-1])) return false;
        }
        return true;
    }
}
