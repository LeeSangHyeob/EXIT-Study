https://leetcode.com/problems/sorting-the-sentence/

public class sortSentence {

	public static void main(String[] args) {
		//int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}

	private static String sortSentence(String s) {
		
		String[] arr = s.split(" ");
		String[] arr2 = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int idx = Integer.valueOf(arr[i].substring(arr[i].length()-1));
			arr2[idx-1] = arr[i].substring(0, arr[i].length()-1);
		}
		
		/* String.join(" ", arr2); */
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < arr2.length; i++) {
			sb.append(arr2[i]);
			if(i != arr2.length - 1) sb.append(" ");
		}
			
		return sb.toString();
	}

}
