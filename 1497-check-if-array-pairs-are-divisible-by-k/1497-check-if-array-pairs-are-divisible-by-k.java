class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[] = new int[k];
        for(int n: arr){
            int rem = ((n %k) + k) % k;
            map[rem] = map[rem] + 1;
        }

        if(map[0] % 2 != 0){
            return false;
        }

        for(int i = 1; i<=k/2; i++){
            int complement = k - i;
            if(map[i] != map[complement]){
                return false;
            }
        }
        return true;
    }
}