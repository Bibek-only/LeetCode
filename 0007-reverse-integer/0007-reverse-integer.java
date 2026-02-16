class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x<0){
            sign = -1;
            x = x* -1;
        }
        int rev = 0;
        while(x > 0){
            int mod = x % 10;
            x = x/10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && mod > Integer.MAX_VALUE % 10)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && mod < Integer.MIN_VALUE %10)){
                return 0;
            }
            rev = rev * 10 + mod;
        }
        
        rev =  sign * rev;
        return rev;
    }
    
}