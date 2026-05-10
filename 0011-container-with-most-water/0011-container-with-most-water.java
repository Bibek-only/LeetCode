class Solution {
    public int maxArea(int[] height) {
        int si = 0;
        int ei = height.length - 1;

        int maxWater = Integer.MIN_VALUE;
        int currentMax;
        
        while(si < ei){
            currentMax = (ei - si) * (Math.min(height[si], height[ei]));
            if(currentMax > maxWater){
                maxWater = currentMax;
            }
            if(height[si] < height[ei]){
                si++;
            }else{
                ei--;
            }
        }
        return maxWater;
    }
}