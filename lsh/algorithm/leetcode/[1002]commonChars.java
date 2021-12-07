https://leetcode.com/problems/find-common-characters/description/

class Solution {
    public List<String> commonChars(String[] words) {
        int[] arr1 = new int[26];
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            int[] arr2 = new int[26];
            char[] arr = words[i].toCharArray();
            
            for(int j = 0; j < arr.length; j++){
                int idx = arr[j] - 'a';
                if(i == 0){
                    arr1[idx]++;
                } else {
                    arr2[idx]++;
                }
            }
            if(i != 0){
                for(int j = 0; j < 26; j++){
                    arr1[j] = arr1[j] > arr2[j] ? arr2[j] : arr1[j];
                }
            }
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr1[i]; j++) {
                ans.add(Character.toString((char) ('a' + i)));
            }
        }
        
        return ans;
    }
}
