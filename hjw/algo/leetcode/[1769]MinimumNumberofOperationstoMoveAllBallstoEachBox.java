class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length();
        int[] rs = new int[size];
        
        // List:ball add idx
        for(int i=0;i<size;i++) {
            if(boxes.charAt(i) == '1') {
                // Calculate move each idx
                for(int j=0;j<size;j++) {
                    rs[j] += Math.abs(i-j);
                }
            }
        }
        return rs;
        
    }
}
