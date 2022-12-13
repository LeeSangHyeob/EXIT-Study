https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/description/

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int len = skill.length;
        long ans = 0;

        int val = skill[0] + skill[len-1];
        for(int i = 0; i < len / 2; i++) {
            if(val != skill[i] + skill[len-i-1]) return -1;
            ans += skill[i] * skill[len-i-1];
        }
        return ans;
    }
}
