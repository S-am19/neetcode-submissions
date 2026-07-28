class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i =0;
        int j = 0;
        int k = 0;
        while(i<m && j < n){
            if(nums2[j] < nums1[i])
            nums[k] = nums2[j++];
            else
            nums[k] = nums1[i++];
            k++;
        }
        while(i<m)
        nums[k++] = nums1[i++];

        while(j<n)
        nums[k++] = nums2[j++];

        for(int p = 0;p<m+n;p++){
            nums1[p] = nums[p];
        } 
    
       
    }
}