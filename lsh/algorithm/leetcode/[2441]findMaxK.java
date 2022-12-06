https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

/**
 *  A와 -A 가 존재하는 숫자 중 가장 큰 숫자를 리턴 없으면 -1 리턴
*/
class Solution {
    public int findMaxK(int[] nums) {
        // 양수 저장 SET
        Set<Integer> setp = new HashSet<>();
        // 음수 저장 SET
        Set<Integer> setm = new HashSet<>();
        
        int ans = -1;
        
        for(int num : nums){
            
            // 음수면, 양수 SET contains 체크 (num에 abs)
            if(num < 0) {
                if(setp.contains(Math.abs(num))) ans = ans > Math.abs(num)? ans : Math.abs(num);
                setm.add(Math.abs(num));
            // 양수면, 음수 SET contains 체크
            } else {
                if(setm.contains(num)) ans = ans > num? ans : num;
                setp.add(num);
            }
        }
        
        return ans;
    }
}
