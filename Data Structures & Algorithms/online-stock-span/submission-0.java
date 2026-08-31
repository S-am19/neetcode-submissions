class StockSpanner {
ArrayList<Integer> stack ;
int l,top;
    public StockSpanner() {
            stack = new ArrayList<>();
            l = 0;
            top = -1;
    }
    
    public int next(int price) {
        int count = 1;
        int r = top;
        top++;
        while (l <= r && stack.get(r)<= price) {
            count++;
            r--;
        }
        stack.add(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */