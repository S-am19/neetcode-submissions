class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        
        int[] arr = new int[n];
        for(int i = 0 ; i < n - 1 ; i++){
            int count = 1;
            int j = i+1;
            while(j < n && temperatures[j]<=temperatures[i]){
                count++;
                j++;
            }
            if(j == n) arr[i] = 0;
            else arr[i] = count;
        }
        arr[n-1] = 0;
        return arr;
    }
}
