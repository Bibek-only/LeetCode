class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String str3 = str1 + str2;
        String str4 = str2 + str1;

        if( ! (str3.equals(str4))){
            return "";
        }else{
            int len1 = str1.length();
            int len2 = str2.length();

            while(len2 != 0){
                int r = len1 % len2;
                len1 = len2;
                len2 = r;
            }

            return str1.substring(0,len1);

        }
    }
}