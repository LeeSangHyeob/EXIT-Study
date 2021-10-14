https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
//            Start -> End
//             tmp.add(0, 1);
            
//             for(int j = 1; j < tmp.size() - 1; j++){
//                 tmp.set(j, tmp.get(j) + tmp.get(j+1));
//             }
            
//          End -> Start
//          뒤집은 이유 : 정방향으로 add 시 List Index를 하나씩 미뤄야함
            for(int j = tmp.size() - 1; j >= 1; j--){
                tmp.set(j, tmp.get(j) + tmp.get(j-1));
            }
            
            tmp.add(1);
            ans.add(new ArrayList<>(tmp));
        }
        
        return ans;
    }
}
