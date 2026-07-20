class MyStack {

    Queue<Integer> queue=new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        
        queue.offer(x);
        int n=queue.size();
        for(int i=0; i<n-1; i++)
        {
            int val=queue.poll();
            queue.offer(val);
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */