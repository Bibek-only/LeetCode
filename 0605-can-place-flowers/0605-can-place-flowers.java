class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int newArr[] = new int[len+2];
        int newArrLen = len+2;
        int canPlant = 0;
        for(int i = 0; i<len; i++){
            newArr[i+1] = flowerbed[i];
        }

        for(int i = 1; i<newArrLen-1; i++){
            if( newArr[i-1] == 0 && newArr[i] == 0 && newArr[i+1] == 0){
                canPlant++;
                newArr[i] = 1;
            }
        }

        if(n>canPlant){
            return false;
        }else{
            return true;
        }

    }
}