class Solution {
    public boolean isVowel(char ch){
        if (ch == 'a' ||
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
       char arr[] = s.toCharArray();
       int len = arr.length;
       int si = 0;
       int ei = len-1;

       while (si < ei ){
            if(isVowel(arr[si]) && isVowel(arr[ei])){
                char temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }
            else if(!isVowel(arr[si])){
                si++;
            }
            else if(!isVowel(arr[ei])){
                ei--;
            }
       }

       return new String(arr);

    }
}