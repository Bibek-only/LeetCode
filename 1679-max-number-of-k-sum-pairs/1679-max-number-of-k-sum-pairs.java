class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
       int si = 0;
       int ei = nums.length -1;
       int numberOfOperation = 0;
       int currentSum = 0;
       while(si < ei){
         currentSum = nums[si] + nums[ei];
        if(currentSum == k){
            numberOfOperation++;
            si++;
            ei--;
        }
        else if(currentSum < k){
            si++;
        }else{
            ei--;
        }
       } 
       return numberOfOperation;
    }
}