class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        int len = nums.length;
        int ans = 0;
        for(i = 0; i<len; i++){
            int required = k - nums[i];
            if(hm.containsKey(required) && hm.get(required) > 0){
                ans++;
                hm.put(required, hm.get(required) - 1);
            }else{
                if(hm.containsKey(nums[i])){
                    hm.put(nums[i], hm.get(nums[i]) + 1 );
                }else{

                hm.put(nums[i],1);
                }
            }
        }
        return ans;
    }
}