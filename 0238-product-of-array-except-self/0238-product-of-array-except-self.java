class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int prefix[] = new int [len];
        int postfix[] = new int [len];
        int ans[] = new int [len];

        prefix[0] = 1;
        postfix[len-1] = 1;

       

        for(int i = 1; i<len; i++){
            prefix[i] =nums[i-1] * prefix[i-1];
            
        }

        for(int i = len-2; i>=0; i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }

        for (int i = 0; i<len ;i++){
            ans[i] = prefix[i] * postfix[i];
        }
        return ans;
    }
}