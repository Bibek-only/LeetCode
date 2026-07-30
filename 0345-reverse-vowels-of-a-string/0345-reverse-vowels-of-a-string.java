class Solution {
    public boolean isVowel(char ch){
        if(
            ch == 'a' ||
            ch == 'e' ||
            ch == 'i' ||
            ch == 'o' ||
            ch == 'u' ||
            ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U'
        ){
            return true;
        }else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        char chars[] = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i<j){
            if(
                isVowel(chars[i]) && isVowel(chars[j])
            ){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            if(! isVowel(chars[i])){
                i++;
            }
            if(! isVowel(chars[j])){
                j--;
            }
        }
        return new String(chars);
    }
}