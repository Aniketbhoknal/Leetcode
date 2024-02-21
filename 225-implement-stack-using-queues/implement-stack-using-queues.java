class MyStack {
    public ArrayList<Integer> stack;

    public MyStack() {
      this.stack = new ArrayList<Integer>();    
    }
    
    public void push(int x) {
        this.stack.add(x);
    }
    
    public int pop() {
        return this.stack.remove(this.stack.size() - 1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }
    
    public boolean empty() {
        return this.stack.size() == 0 ? true : false;
    }
}
