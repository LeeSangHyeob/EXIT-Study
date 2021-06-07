https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/start/

public int solution(int X, int Y, int D) {
		System.out.println((Y-X) % D);
		if((Y-X) % D == 0) {
			return (Y-X) / D;
		} else {
			return ((Y-X) / D) + 1;
		}
	}
