class MyQueue {
     Stack<Integer> behind = new Stack<>();
     Stack<Integer> top = new Stack<>();
     int x;
    public MyQueue() {
        x = 0;
    }
    
    public void push(int x) {
         top.push(x);
    }
    
    public int pop() {
         if (!top.isEmpty())
            while (!top.isEmpty()) {
                behind.push(top.pop());
            }
        if (!behind.isEmpty())
            x = behind.pop();
        while (!behind.isEmpty()) {
            top.push(behind.pop());
        }
        return x;
    }
    
    public int peek() {
        if (!top.isEmpty())
            while (!top.isEmpty()) {
                behind.push(top.pop());
            }
        if (!behind.isEmpty())
            x = behind.peek();
        while (!behind.isEmpty()) {
            top.push(behind.pop());
        }
        return x;
    }
    
    public boolean empty() {
        if (top.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */