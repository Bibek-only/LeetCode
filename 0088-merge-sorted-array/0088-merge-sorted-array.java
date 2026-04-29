class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sorted[] = new int[m+n];
        int i =0, j = 0, k =0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                sorted[k++] = nums1[i++];
            }else{
                sorted[k++] = nums2[j++];
            }
        }
        while(i<m){
            
                sorted[k++] = nums1[i++];
            
        }
        while(j<n){
            
                sorted[k++] = nums2[j++];
            
        }

        for(int l = 0; l<sorted.length; l++){
            nums1[l] = sorted[l];
        }
        
    }
}