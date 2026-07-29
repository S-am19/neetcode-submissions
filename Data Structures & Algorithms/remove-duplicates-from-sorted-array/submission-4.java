class Solution {
    public int removeDuplicates(int[] nums) {
    
         int no = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[no] != nums[i]){
                no++;
                nums[no]=nums[i];
            }
        }
        return no+1;
    }
}