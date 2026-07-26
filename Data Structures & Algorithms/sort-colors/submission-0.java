class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i = 0;i<3;i++){
            count[i] = 0;
        }
        for(int i = 0 ; i<nums.length ;i++){
           count[nums[i]] = count[nums[i]] + 1;
        }
        int k = 0;
        for(int i = 0 ; i < 3 ;i++){
            int j = 0;
            while(j < count[i]){
                nums[k] = i;
                j++;
                k++;
            }
        }
    }
}