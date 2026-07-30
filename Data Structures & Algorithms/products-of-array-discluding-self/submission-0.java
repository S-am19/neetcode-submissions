class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = 1;
        int[] mult = new int[nums.length];
        mult[0] = nums[0];
        for(int i= 0; i< nums.length;i++){
            int l = i-1;
            int r = i+1;
            int prod = 1;
            while(l>=0 && r<nums.length){
                prod = prod*nums[l]*nums[r];
                l--;
                r++;
            }
            while(r<nums.length ){
                prod = prod*nums[r++];
            }
            while(l >= 0 ){
                 prod = prod*nums[l--];
            }
            mult[i] = prod;
        }
        return mult;
    
    }
}  
