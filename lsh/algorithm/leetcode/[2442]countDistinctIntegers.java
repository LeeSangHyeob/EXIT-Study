https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
            set.add(reverseInt(num));
        }
        
        return set.size();
    }

    public int reverseInt(int num) {
        int val = 0;
        StringBuffer sb = new StringBuffer();


        while (num / 10 != 0) {
            sb.append(num % 10);
            num /= 10;
        }

        sb.append(num);
      
        return Integer.parseInt(sb.toString());
    }
}
