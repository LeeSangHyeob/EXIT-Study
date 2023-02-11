https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int among = 0;

        for(int i : candies){
            among = among > i? among : i;
        }

        for(int i : candies){
            if(among <= i + extraCandies) ans.add(true);
            else ans.add(false);
        }

        return ans;
    }
}
