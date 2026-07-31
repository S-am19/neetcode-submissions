class Solution {
    public int maxProfit(int[] prices) {

        int maxP = 0;
        boolean[] isUsed = new boolean[prices.length];
        for(int i = 0 ; i<isUsed.length ; i++)
        isUsed[i] = false;
        for(int i = 0 ; i<prices.length-1 ; i++){
         int curr = i+1;
         while( curr < prices.length && prices[curr] > prices[curr-1]){
            curr++;
         }
         
        if(  !isUsed[curr-1] && !isUsed[i]){
        maxP += prices[curr-1]-prices[i];
        isUsed[curr-1] = true;
        isUsed[i] = true;
        }
           
        }
        return maxP;
    }
}