class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        // int len1 = s.length();
        // int len2 = t.length();
        while(i<s.length()){
            if(j>=t.length()){
                return false;
            }
            else if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }   
        return true;
    }
}