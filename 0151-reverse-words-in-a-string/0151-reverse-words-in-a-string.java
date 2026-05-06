class Solution {
    public String reverseWords(String s) {
       String reverseString  = new StringBuilder(s).reverse().toString();
       int len = reverseString.length();
        String ans = "";
       for(int i = 0; i<len; i++){
        String word = "";
        while(i<len && reverseString.charAt(i) != ' '){
            word += reverseString.charAt(i);
            i++;
        }

        if(word.length() > 0){
            ans += " " + new StringBuilder(word).reverse().toString();
        }

       }
       return ans.trim();
    }
}