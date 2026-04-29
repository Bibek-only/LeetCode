class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int len = candies.length;
        int mostNumberOfCandies = candies[0];
        int i = 0;
        for(i = 0; i<len; i++){
            if(mostNumberOfCandies < candies[i]){
                mostNumberOfCandies = candies[i];
            }
        }

        for(i =0; i<len; i++){
            if((candies[i] + extraCandies) >= mostNumberOfCandies){
                al.add(true);
            }else{
                al.add(false);
            }
        }

        return al;
    }
}