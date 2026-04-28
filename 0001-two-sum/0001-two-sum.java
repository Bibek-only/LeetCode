
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(hm.size() != 0){
                int required = target - nums[i];
                    if(hm.containsKey(required)){
                        return new int[]{hm.get(required),i};
                    }else{
                        hm.put(nums[i],i);
                    }
            }
            hm.put(nums[i],i);
        }
    return new int[]{-1,-1};
    }
}