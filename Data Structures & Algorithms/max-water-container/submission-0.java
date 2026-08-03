class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int l = 0 ;
        int r = n-1;
        while(l < r){
            int h = Math.min(height[l] , height[r]);
            int w = r-l;
            int a= h*w;
            if(a > area){
                area = a;
            }
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
    return area;
        
    }
}