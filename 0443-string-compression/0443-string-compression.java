class Solution {
    public int compress(char[] chars) {

        int len = chars.length;
        int newLen = 0; // track the new modifyed char array

        for(int i = 0; i<len; i++){

            char currentChar = chars[i]; // to tract the occurance of current consecutive charecter
            int currentCharCount = 0;

            while(i<len && currentChar == chars[i]){ //coutnt logic
                currentCharCount++;
                i++;
            }

            if(currentCharCount > 1){ // handel if theris more than 1 consicutive charecter
                chars[newLen++] = currentChar;

                //convertthe current count to stirng then store each charecter to the array
                String stringValue = String.valueOf(currentCharCount);

                for (char ch: stringValue.toCharArray()){ // strore each current cout digit to the char array
                chars[newLen++] = ch;

                }
                
            }else{
                chars[newLen] = currentChar; //handel if ther is only one chaercter
                newLen++;
            }
            i--; // cancle/neutralize the miultiple updation in while and for loop
        }
        return newLen;
    }
}