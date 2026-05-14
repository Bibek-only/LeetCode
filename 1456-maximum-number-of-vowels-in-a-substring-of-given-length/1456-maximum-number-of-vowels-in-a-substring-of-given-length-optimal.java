class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' ||
            ch == 'e' ||
            ch == 'i' ||
            ch == 'o' ||
            ch == 'u'
        ){
            return true;
        }else{
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int len = s.length();

        int count = 0;
        int ans = 0;

        for(int i = 0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        ans = count;

        for(int i = k; i<len; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(count > ans){
                ans = count;
            }
        }

        return ans;
    }
}