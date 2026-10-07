class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[l] <= nums[mid]) {

                // Target lies in sorted left half
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } 
                else {
                    l = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in sorted right half
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } 
                else {
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
}