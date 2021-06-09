https://leetcode.com/problems/find-and-replace-pattern/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
		String tmp = checkPattern(pattern);
		
		for (String s : words) {
			if (tmp.equals(checkPattern(s))) {
				list.add(s);
			}
		}
		return list;
	}

	public static String checkPattern(String s) {
		int idx = 0;
		String pattern = "";
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {;
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), idx++);
			}
			pattern += map.get(s.charAt(i));
		}
		return pattern;
    }
}
