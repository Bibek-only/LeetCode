class Solution {
    public String gcdOfStrings(String str1, String str2) {

        String str3 = str1 + str2;
        String str4 = str2 + str1;

        if(!str3.equals(str4)){ // if the adding the strngs->  str1+str2 and str2+str1 is identical means they contain a common sub stirng that devide them, if not then it does not contain a common substing that devide the stings
            return "";
        }else{
            int str1Len = str1.length();
            int str2Len = str2.length();

            // now find the gretest comon divisor 
            int gcd = Math.min(str1Len, str2Len); // now this common devisor will the length of the sub sting that devide both the strigh
            while (!(str1Len % gcd == 0 && str2Len % gcd == 0)){
                gcd--;
            }

            return str1.substring(0,gcd); 
        }
    }
}