class myStack {

  private int[] arr;
      private int top;
      private int capacity;

      // Constructor to initialize the stack
      public myStack(int n) {
          capacity = n;
          arr = new int[capacity];
          top = -1; // -1 indicates an empty stack
      }

      public void push(int x) {
          if (!isFull()) {
              top++;
              arr[top] = x;
          }
      }

      public void pop() {
          if (!isEmpty()) {
              top--;
          }
      }

      public int peek() {
          if (isEmpty()) {
              return -1;
          }
          return arr[top];
      }

      public boolean isEmpty() {
          return top == -1;
      }

      public boolean isFull() {
          return top == capacity - 1;
      }
}