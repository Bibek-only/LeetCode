class Solution {
    public boolean containsDuplicate(int[] nums) {

        int len = nums.length;
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i = 0; i<len; i++){
            // check it is already exist or not
            if(hm.containsKey(nums[i])){
                return true;
            }else{
                hm.put(nums[i],true);
            }
        }

        return false;

    }
}