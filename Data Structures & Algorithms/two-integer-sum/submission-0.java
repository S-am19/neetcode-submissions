class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i<2 ;i++){
            ans[i] = 0;
        }
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            int k = target - nums[i];
            for(int j = i+1 ;j<n;j++){
                if(nums[j] == k){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
