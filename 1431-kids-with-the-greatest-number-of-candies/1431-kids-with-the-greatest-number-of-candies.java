class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = candies[0];
        for(int n: candies){
            if(n > max){
                max = n;
            }
        }
        for(int n: candies){
            if( (n+extraCandies) >= max ){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}