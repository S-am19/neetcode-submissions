class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i<n-1 ; i++){
            if(nums[i+1] < nums[i]){
                count = i+1;
                break;
            }
        }
        return nums[count];
        
    }
}
