class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> zeroStack = new Stack<>();
        Stack<Integer> nonZeroStack = new Stack<>();
        int len = nums.length;
        int i = 0;
        int count = 0;
        for(i = len-1; i>=0; i--){
            if(nums[i] == 0 ){
                zeroStack.push(nums[i]);
            }else{
                nonZeroStack.push(nums[i]);
            }
        }
        while(!nonZeroStack.empty()){
            nums[count++] = nonZeroStack.pop();
        }
        while(!zeroStack.empty()){
            nums[count++] = zeroStack.pop();
        }
    }
}