https://leetcode.com/problems/student-attendance-record-i/description/

class Solution {
    public boolean checkRecord(String s) {
        
        int a = 0;
        int l = 0;

        for(char c : s.toCharArray()) { 
            switch(c) {
                case 'A':
                    if(a == 1) return false;
                    a++;
                    l = 0;
                    break;
                case 'L':
                    if(l == 2) return false;
                    l++;
                    break;
                case 'P':
                    l = 0;
                    break;
            }
        }

        return true;
    }
}
