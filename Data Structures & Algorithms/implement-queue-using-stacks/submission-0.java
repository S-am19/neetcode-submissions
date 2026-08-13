
class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    /** Pushes element x to the back of the queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from the front of the queue and returns it. */
    public int pop() {
        peek(); // Ensures output stack has the front element on top
        return output.pop();
    }
    
    /** Returns the element at the front of the queue. */
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns true if the queue is empty, false otherwise. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}