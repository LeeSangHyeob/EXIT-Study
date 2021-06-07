https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/start/

public int solution(int[] A) {
		
		Set<Integer> set = new HashSet<>();
		
		
        for(int i : A){
            if(set.contains(i)){
                set.remove(i);
            } else {
            	set.add(i);
            }
        }
        return set.iterator().next();
	}
