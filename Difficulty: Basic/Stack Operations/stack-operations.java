class myStack {
    // Define your stack
    private int data[];
    private int top;
    private int capacity;
    public myStack(){
        this.capacity = 1000;
        this.top = -1;
        this.data = new int[capacity];
    }

    public void push(int x) {
        // insert x into stack
        if(top == capacity-1){
            System.out.println("The Stack is overflow");
            return;
        }
        data[++top] = x;
        
    }

    public void pop() {
        // remove top ele from stack
        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
       top--;
    }

    public int peek() {
        // return top of stack
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
     return data[top];   
    }

    public int getSize() {
        // return current size of stack
        return top+1;
    }

    public boolean isEmpty() {
        // check whether stack is empty
        return top==-1;
    }
}
