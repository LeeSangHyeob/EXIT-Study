https://leetcode.com/problems/detect-capital/description/

class Solution {
    public boolean detectCapitalUse(String word) {

        if(word.length() == 1) return true;

        char[] arr = word.toCharArray();
        int flag1 = arr[0] - 97;
        int flag2 = arr[1] - 97;
        
        if(flag1 >= 0 && flag2 < 0) return false;

        for(int i = 2; i < arr.length; i++){
            int tmp = arr[i] - 97;
            if((flag2 < 0 && tmp >= 0) ||
                (flag2 >= 0 && tmp < 0)) return false;
        }

        return true;
    }
}
