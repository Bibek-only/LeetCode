class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int flowerBed2[] = new int[len+2];
        for(int i = 0; i<len; i++){
            flowerBed2[i+1] = flowerbed[i];
        }

        int canPlace = 0;
        for(int i = 1; i<=len; i++){
            if(flowerBed2[i] == 0){
                if(flowerBed2[i-1] == 0 && flowerBed2[i+1] == 0){
                    canPlace++;
                    flowerBed2[i] = 1;
                }
            }
        }

        if(canPlace >= n){
            return true;
        }else{
            return false;
        }

    }
}