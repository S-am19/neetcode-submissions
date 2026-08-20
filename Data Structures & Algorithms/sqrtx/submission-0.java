class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int low = 1;
        int high = x / 2;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                // mid^2 <= x
                ans = mid;
                low = mid + 1;
            } else {
                // mid^2 > x
                high = mid - 1;
            }
        }

        return ans;
    }
}