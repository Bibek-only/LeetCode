class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int maxConOnes = 0;
        int currentZeroCount = 0;
        int currentLen = 0;

        for (int i = 0; i<len; i++){
            currentZeroCount = 0;
            for (int j = i; j<len; j++){
                if(nums[j] == 0){
                    currentZeroCount++;
                }
                if(currentZeroCount <= k){
                    currentLen = (j - i) + 1;
                    maxConOnes = Math.max(maxConOnes, currentLen);
                }else{
                    break;
                }
            }
        }
        return maxConOnes;
    }
}