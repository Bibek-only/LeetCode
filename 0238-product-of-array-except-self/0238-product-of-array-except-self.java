class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length; //hello yeah
        int ans[] = new int[len];
        int i = 0;

        for(i = 0; i<len; i++){
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = nums[i] * prefix[i-1];
            }
        }

        for(i = len-1; i>=0; i--){
            if(i == len -1){
                postfix[i] = nums[i];
            }else{
                postfix[i] = nums[i] * postfix[i+1];
            }
        }

        for (i = 0; i<len; i++){
            if(i == 0){
                ans[i] = postfix[i+1];
            }else if(i == len-1){
                ans[i] = prefix[i-1];
            }else{
                ans[i] = prefix[i-1] * postfix[i+1];
            }
        }

        return ans;
    }
}