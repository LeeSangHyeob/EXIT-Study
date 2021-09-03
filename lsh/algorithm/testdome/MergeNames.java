import java.util.*;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set = new HashSet<>();
        
        for(String s : names1){
            set.add(s);
        }
        
        for(String s : names2){
            set.add(s);
        }
        
        Iterator<String> iter = set.iterator();
        int idx = 0;
        String[] ans = new String[set.size()];
        
        while(iter.hasNext()){
            ans[idx++] = iter.next();
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
