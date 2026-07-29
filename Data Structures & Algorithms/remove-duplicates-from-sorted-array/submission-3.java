class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int r = 0;

        while (r < nums.length) {
            nums[k++] = nums[r];
            int i = r;
            while (i < nums.length && nums[i] == nums[r]) {
                i++;
            }

        r = i; // Jump to the next unique element
        }

        return k;
      
    }
}