https://leetcode.com/problems/robot-return-to-origin/description/

class Solution {
    public boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;
        for(int i = 0; i < moves.length(); i++){
            switch(moves.charAt(i)) {
                case 'L':
                    lr++;
                    break;
                case 'R':
                    lr--;
                    break;
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
            }
        }
        
        return lr == 0 && ud == 0;
    }
}
