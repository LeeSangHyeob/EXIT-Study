https://programmers.co.kr/learn/courses/30/lessons/83201

class Solution {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < scores.length; i++){
            int sum = 0;
            int max = 0;
            int min = 100;
            int cnt = scores.length;
            for(int j = 0; j < scores.length; j++){
                if(j != i){
                    max = max > scores[j][i]? max : scores[j][i];
                    min = min < scores[j][i]? min : scores[j][i];
                }
                sum += scores[j][i];
            }
            if(max < scores[i][i] || min > scores[i][i]){
                sum -= scores[i][i];
                cnt--;
            }
            
            switch(sum / cnt / 10){
                case 10:
                case 9:
                    sb.append("A");
                    break;
                case 8:
                    sb.append("B");
                    break;
                case 7:
                    sb.append("C");
                    break;
                case 6:
                case 5:
                    sb.append("D");
                    break;
                default:
                    sb.append("F");
                    break;
            }
        }
        return sb.toString();
    }
}
