class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = 0;
        }
        Deque<Integer> stack = new ArrayDeque<>(); //gets indices
        for(int i = 0 ; i<n ; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int top = stack.pop();
                arr[top] = i-top;
            }
            stack.push(i);
        }
        return arr;
    }
}
