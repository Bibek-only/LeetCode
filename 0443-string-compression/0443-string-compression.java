class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int newLen = 0;
        for(int i = 0; i<len; i++){
            char currentChar = chars[i];
            int currentCharCount = 0;
            while(i<len && currentChar == chars[i]){
                currentCharCount++;
                i++;
            }
            if(currentCharCount > 1){
                //convery the current count to stirng then store each charecter to the array
                chars[newLen++] = currentChar;
                String stringValue = String.valueOf(currentCharCount);
                for (char ch: stringValue.toCharArray()){
                chars[newLen++] = ch;

                }
                
            }else{
                chars[newLen] = currentChar;
                newLen++;
            }
            i--;
        }
        return newLen;
    }
}