import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] method1 = {1,2,3,4,5};
        int[] method2 = {2,1,2,3,2,4,2,5};
        int[] method3 = {3,3,1,1,2,2,4,4,5,5};
        int o1 = 0;
        int o2 = 0;
        int o3 = 0;
        for(int i=0;i<answers.length ; i++) {
            if(answers[i] == method1[i%5]) o1++;
            if(answers[i] == method2[i%8]) o2++;
            if(answers[i] == method3[i%10]) o3++;
        }
        int max = Math.max(o1,o2);
        max = Math.max(max,o3);
        List<Integer> ls = new ArrayList<Integer>();
        if(o1 == max) ls.add(1);
        if(o2 == max) ls.add(2);
        if(o3 == max) ls.add(3);
        int[] rs = new int[ls.size()];
        int cnt = 0;
        for(int t : ls) {
            rs[cnt++] = t;
        }
        return rs;
    }
}
