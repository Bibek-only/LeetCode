class Solution {
    public void moveZeroes(int[] nums) {
        int swapPointer = 0;
        int len = nums.length;
        int temp = 0;
        for(int i = 0; i<len; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[swapPointer];
                nums[swapPointer] = temp;
                swapPointer++;
            }
        }
    }
}