https://leetcode.com/problems/number-of-burgers-with-no-waste-of-ingredients/description/

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> ans = new ArrayList<>();
        int i = tomatoSlices / 2;
        if(cheeseSlices * 2 > tomatoSlices ||
        tomatoSlices % 2 != 0 || i / 2 > cheeseSlices || i < cheeseSlices) return ans;
        
        ans.add(i - cheeseSlices);
        ans.add(i - 2 * (i - cheeseSlices));

        return ans;

    }
}
