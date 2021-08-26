https://app.codility.com/c/run/training57K4WV-XNA/

class Solution {
    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for(int i : A){
            if(i > 0){
                set.add(i);
            }
        }

        if(set.size() == 0) return 1;

        for(int i = 1; i <= set.size(); i++){
            if(!set.contains(i)) return i;
        }

        return set.size() + 1;
    }
}
