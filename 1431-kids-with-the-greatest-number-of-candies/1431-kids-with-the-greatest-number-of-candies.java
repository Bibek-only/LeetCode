class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int len = candies.length;
        List<Boolean> ans = new ArrayList<>();

        for(int i: candies){
            max = Math.max(i,max);
        }
        
        for(int i: candies){
            int res = i + extraCandies;
            if(res >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}