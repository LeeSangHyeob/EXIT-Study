https://app.codility.com/c/run/trainingK7R6ZK-NRV/

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            if((i > A.length)
            || (set.contains(i))) return 0;
            else set.add(i);
        }
        return 1;
    }
}
