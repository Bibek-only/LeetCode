class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        double avg = 0.0;
        double ans = 0.0;
        int len = nums.length;

        int i = 0;
        for(i = 0; i<k; i++){
            sum += nums[i];
        }

        avg = (sum * 1.0) / k;
        ans = avg;

        for(i = k; i<len; i++){
            sum = (sum + nums[i]) - nums[ i - k];
            avg = (sum * 1.0) / k;
            if(avg > ans){
                ans = avg;
            }
        }
        return ans;
    }
}