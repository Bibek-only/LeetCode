class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return false;
        }
        int less = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for(int i = 0; i<len; i++){
           if(nums[i] <= less){
            less = nums[i];
           }
           else if(nums[i] <= mid){
            mid= nums[i];
           }else{
            return true;
           }
        }
        return false;
    }
}