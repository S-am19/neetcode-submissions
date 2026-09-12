class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int n = piles.length;
        for (int pile : piles) {
          max = Math.max(max, pile);
        }
        int min_k = max;  
        int l = 1;
        int r = max;
        while(l<=r){
            int mid = l + ((r-l)/2);
            int hours = 0;
            for (int pile : piles) {
                // Integer ceiling arithmetic to prevent float imprecision
                hours += (pile + mid - 1) / mid; 
            }
            if(hours <= h){
                min_k = mid;
                r = mid-1;
            }
            else {
                l = mid+1;
            }
    }
        return min_k; 
    }
}
