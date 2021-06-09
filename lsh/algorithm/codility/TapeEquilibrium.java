https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/

class Solution { public int solution(int[] A) { long sum = 0; long lsum = 0; long rsum = 0; for(long i : A){ sum += i; } long min = Long.MAX_VALUE; for(int i = 1; i < A.length; i++){ lsum += A[i-1]; rsum = sum - lsum; long val = rsum > lsum ? rsum - lsum : lsum - rsum; min = val > min ? min : val; } return (int) min; } }
