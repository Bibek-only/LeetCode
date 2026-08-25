class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        
        for(int n: arr){
            if(map.containsKey(n)){
                 map.put(n, map.get(n) + 1);
            }else{
                map.put(n,1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());

        if(set.size() == map.size()){
            return true;
        }else{
            return false;
        }

        
    }
}