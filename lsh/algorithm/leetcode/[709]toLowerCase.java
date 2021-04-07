https://leetcode.com/problems/to-lower-case/

class Solution {
    public String toLowerCase(String str) {
         char[] arr = str.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	if(!Character.isLowerCase(arr[i]) && 
        		(arr[i] >= 65 && arr[i] <= 90)){
        		arr[i] = (char) (arr[i] + 32);
        	}
        }
        return String.valueOf(arr);
    }
}
