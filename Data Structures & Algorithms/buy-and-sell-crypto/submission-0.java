class Solution {

  int findMax(int[] right , int l ){
    int max = -1;
    for(int i = l ; i< right.length ;i++){
      if(right[i] > max) max = right[i];
    }
    return max;
  }
    
    public int maxProfit(int[] prices) {
        int profit = 0;
      for(int i = 0; i<prices.length ; i++){
      int max = findMax(prices , i+1);
      if((max - prices[i]) > profit){
        profit = max - prices[i];
      }
      }
      return profit;
        
    }
}
