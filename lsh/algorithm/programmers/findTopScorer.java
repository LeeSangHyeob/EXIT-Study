https://programmers.co.kr/learn/courses/30/lessons/42840?language=java

public static int[] solution(int[] answers) {
        
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,1,2,3,2,4,2,5};
        int arr3[] = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt[] = {0,0,0};
        int idx = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(arr1[i % arr1.length] == answers[i]) cnt[0]++;
        	if(arr2[i % arr2.length] == answers[i]) cnt[1]++;
        	if(arr3[i % arr3.length] == answers[i]) cnt[2]++;
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        for(int j = 0; j < cnt.length; j++) {
        	if(max == cnt[j]) {
        		cnt[idx] = j + 1;
                idx++;
        	}
        }
        
        int[] answer = Arrays.copyOfRange(cnt, 0, idx);

        return answer;
    }
