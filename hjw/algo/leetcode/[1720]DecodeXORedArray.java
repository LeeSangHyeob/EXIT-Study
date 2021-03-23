class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int[] rs =  new int[size+1];
        rs[0] = first;
        for(int i=1;i<=size;i++) {
            rs[i] = rs[i-1]^encoded[i-1];
        }
        return rs;
    }
}
