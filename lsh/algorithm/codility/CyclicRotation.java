https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/start/

public int solution(int[] A) {
		
		if(A.length == 0 || K % A.length == 0) return A;
		int idx = A.length - (K % A.length);
		int[] ans = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			ans[i] = A[(idx + i) % A.length];
		}
		return ans;
	}
