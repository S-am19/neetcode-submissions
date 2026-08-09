class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        boolean found = false;
        for(int r = 0 ; r<nums.length ; r++){
            sum += nums[r];
            while(sum >= target){
                min = Math.min((r-l+1) , min);
                sum -= nums[l];
                l++;
                found = true;
            }
            
        }
        if(found)
        return min;
        else
        return 0;
    }
}