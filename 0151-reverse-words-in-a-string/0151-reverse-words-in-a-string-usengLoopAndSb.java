class Solution {
    public String reverseWords(String s) {
        String wordArray[] = s.trim().split("\\s+"); // split the string into array with spaces
        int len = wordArray.length;
        for (int i = 0; i<len/2; i++){ // swap the array
            String temp = wordArray[i];
            wordArray[i] = wordArray[len-i-1];
            wordArray[len-i-1] = temp;
        }

        return String.join(" ",wordArray); // convert the array into string separate by space
    }
}