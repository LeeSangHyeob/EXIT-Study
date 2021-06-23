https://leetcode.com/problems/excel-sheet-column-title

class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        
        while (columnNumber > 0) {
            ans = (char)(65 + (columnNumber - 1) % 26) + ans;
            columnNumber = (columnNumber - 1) / 26;
        }
        
        return ans;
    }
}
