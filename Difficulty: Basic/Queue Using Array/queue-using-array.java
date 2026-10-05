class myQueue {
 int arr[];
 int size;
 int rear;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return rear == -1;
    }

    public boolean isFull() {
        // Check if queue is full
        return rear == size -1;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()){

            return;
        }
        rear = rear+1;
        arr[rear] = x;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            
            return;
          
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear = rear - 1;
        
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
           
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
            
            return -1;
        }
        return arr[rear];
    }
}
