import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < list.length; i++){
            if(map.get(sum - list[i]) != null){
                return new int[]{i, map.get(sum - list[i])};
            } else {
                map.put(list[i], i);
            }
        }
        
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
