class Solution {
    public int largestAltitude(int[] gain) {
        int altitudes[] = new int [gain.length+1];
        for(int i = 0; i<gain.length; i++){
            altitudes[i+1] = altitudes[i] + gain[i]; 
        }
        int max = altitudes[0];
        for(int n: altitudes){
            max = Math.max(max,n);
        }

        return max;
    }
}