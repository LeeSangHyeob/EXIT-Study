class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if( (int) c > 64 && (int) c < 91 ) c += 32;
            sb.append(c);
        }
        return sb.toString();
    }
}
