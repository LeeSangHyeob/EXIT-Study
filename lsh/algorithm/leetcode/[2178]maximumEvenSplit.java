https://leetcode.com/problems/maximum-split-of-positive-even-integers/description/

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum % 2 != 0) return new ArrayList<Long>();

        Set<Long> set = new HashSet<>();
        List<Long> list = new ArrayList<>();
        for(long i = 2; i <= finalSum; i+=2) {
            set.add(i);
            if(!set.contains(finalSum-i)){
                list.add(i);
                finalSum -= i;
            } else {
                list.add(finalSum);
                break;
            }
        }

        return list;
    }
}
