class Solution {
    public int maxOperations(int[] nums, int k) {
        int si = 0;
        int ei = nums.length -1;
        int ans = 0;
        Arrays.sort(nums);
        while(si < ei){
            int currentSum = nums[si] + nums[ei];
            if(currentSum == k){
                ans++;
                si++;
                ei--;
            }
            else if(currentSum < k){
                si++;
            }else{
                ei--;
            }
        }
        return ans;
    }
}