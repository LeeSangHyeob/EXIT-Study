https://app.codility.com/c/run/training6HXXKK-EKY/

class Solution {
    public int solution(int[] A) {
        int length = A.length + 1;
		long sum = (long) length * (length + 1) / 2;
		for (int i = 0; i < A.length; i++) {
			sum -= A[i];
		}

		return (int) sum;
    }
}
