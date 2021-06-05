https://app.codility.com/c/run/training7BHK34-5YP/

public static int solution(int N) {

		int max = 0;
		int cnt = 0;
		boolean chk = false;
		
		while (true) {
			System.out.println(N + "/" + cnt + "/" + max);
			switch (N % 2) {
			case 0:
				if(chk == true) {
					cnt++;
				}
				break;
			case 1:
				chk = true;
				if(cnt != 0) {
					max = max < cnt ? cnt : max;
					cnt = 0;
				}
				break;
			}

			if (N == 1) {
				break;
			} else {
				N /= 2;
			}

		}
		return max;
	}
