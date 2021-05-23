https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/

import java.util.Arrays;

public class maxWidthOfVerticalArea {

	public static void main(String[] args) {
		// int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int[][] points = { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } };
		System.out.println(maxWidthOfVerticalArea(points));

	}

	private static int maxWidthOfVerticalArea(int[][] points) {

		int ans = 0;
		int idx = 0;
		/*
		 * Arrays.sort(points, new Comparator<int[]>() {
		 * 
		 * @Override public int compare(int[] o1, int[] o2) { if (o1[0] > o2[0]) return
		 * 1; return -1; } });
		 * 
		 * for(int i = 0; i < points.length - 1; i++) { ans = ans < points[i+1][0] -
		 * points[i][0]? points[i+1][0] - points[i][0] : ans; }
		 */
		
		int[] arr = new int[points.length];
		
		for(int[] i : points) {
			arr[idx++] = i[0];
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i+1] - arr[i]);
			ans = ans < arr[i+1] - arr[i]? arr[i+1] - arr[i] : ans;
		}
		return ans;
	}

}
