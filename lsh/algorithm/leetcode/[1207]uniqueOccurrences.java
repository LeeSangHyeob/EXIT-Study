https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {

	public static void main(String[] args) {
		// int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int[] arr = { 1, 2,1,3,3,1};
		System.out.println(uniqueOccurrences(arr));
	}

	private static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int key : map.keySet()) {
			if(set.contains(map.get(key))) {
				return false;
			} else {
				set.add(map.get(key));
			}
		}
		return true;
	}

}
