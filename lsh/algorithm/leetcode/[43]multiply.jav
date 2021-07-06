https://leetcode.com/problems/multiply-strings/

class Solution {
   public static String multiply(String num1, String num2) {

		if (num1.equals("0") || num2.equals("0"))
			return "0";

		//int[] arr1 = Stream.of(num1.split("")).mapToInt(Integer::parseInt).toArray();
		//int[] arr2 = Stream.of(num2.split("")).mapToInt(Integer::parseInt).toArray();
		//int[] ans = new int[arr1.length + arr2.length];
		
		int[] ans = new int[num1.length() + num2.length()];
		StringBuilder sb = new StringBuilder();
		int val = 0;
		
		for (int i = num1.length(); i > 0; i--) {
			for (int j = num2.length(); j > 0; j--) {
				val = (num1.charAt(i-1) - '0') * (num2.charAt(j-1) - '0');
                ans[i+j-1] += val % 10;
                if(ans[i+j-1] >= 10){
                    ans[i+j-1] %= 10;
                    ans[i+j-2]++;
                }
                ans[i+j-2] += val / 10;
                if(ans[i+j-2] >= 10){
                    ans[i+j-2] %= 10;
                    ans[i+j-3]++;
                }
				System.out.println("i : " + i + " / j : " + j + " / val : " + val);
			}
		}
		
		for(int i = 0; i < ans.length; i++) {
			if(!(sb.length() == 0 && ans[i] == 0)) sb.append(ans[i]);
		}
		
		return sb.toString();
	}
}
