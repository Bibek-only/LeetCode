class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0; 
        int right = 0;
        int maxLen = 0;
        int count = 0;
        int currentLen = 0;

        while(right < len){
            if(nums[right] == 0){
                count++;
            }
            while(count > k){
                if(nums[left] == 0) count--;
                left++;
            }
             currentLen = right - left + 1;
            maxLen = Math.max(currentLen, maxLen);
            right++;
        }

        return maxLen;
    }
}