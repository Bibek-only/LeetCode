class Solution {
    public int largestAltitude(int[] gain) {
        
        int currentAltitude = 0;
        int maxAltitude = 0;
        for(int n: gain){
            currentAltitude = currentAltitude + n;
            maxAltitude = Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}