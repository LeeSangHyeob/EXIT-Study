class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        return num%2 == 0 ? numberOfSteps(num/2)+1 : numberOfSteps(num-1)+1;
    }
}
