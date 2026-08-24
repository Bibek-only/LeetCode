class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while(i<j){
            
            int currentCapacity = (j-i) * Math.min(height[i],height[j]);
            if(currentCapacity > maxWater){
                maxWater = currentCapacity;
            }

            if(height[i] < height[j]){
                i++;
            }else{ 
                j--;
            }

        }
        return maxWater;
    }
}