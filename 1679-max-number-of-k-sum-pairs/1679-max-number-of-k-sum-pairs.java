class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
       int si = 0;
       int ei = nums.length-1;
       int ans = 0;
       while(si < ei){
         
        if(nums[si] + nums[ei] == k){
            ans++;
            si++;
            ei--;
        }else if(nums[si] + nums[ei] < k){
            si++;
        }else{
            ei--;
        }
       }
        return ans;
    }
}