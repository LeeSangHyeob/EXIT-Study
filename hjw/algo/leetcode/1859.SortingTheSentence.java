
class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int size = arr.length;
        String[] rs = new String[size+1];
        for(String t : arr) {
            int sz = t.length();
            int idx = Integer.parseInt(t.substring(sz-1));
            rs[idx] = t.substring(0,sz-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=size;i++) {
            sb.append(rs[i]);
            if(i!=size) sb.append(" ");
        }
        return sb.toString();
    }
}
