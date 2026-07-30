class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String strs[] = str.split("\\s+");
        int len = strs.length;
        int i = 0; 
        int j = len-1;
        while(i<j){
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }

        return String.join(" ",strs);
    }
}