class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copy = x;
        int num = 0;
        while(x != 0){
            int r = x % 10;
            num = num * 10 + r;
            x = x/10;
        }
        if(num == copy){
            return true;
        }else{
            return false;
        }
    }
}