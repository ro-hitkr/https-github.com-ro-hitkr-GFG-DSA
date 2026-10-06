class MyQueue {
    
    int arr[];
    int size;
    int rear;

    public MyQueue() {
        // code here
        arr = new int[100005];
        size = arr.length;
        rear = -1;
        
    }

    public void enqueue(int x) {
        
        // code here
        if(rear == size-1){
            return;
        }
        rear = rear+1;
        arr[rear] = x;
    }
    
        
    public void dequeue() {
        // code here
        if(isEmpty()){
            return;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
    }
        

    public int getFront() {
        // code here
        if(isEmpty()){
            return -1;
        }
        return arr[0];
        
        
    }

    public int getRear() {
        
        // code here
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }

        
    public boolean isEmpty() {
        // code here
        return rear == -1;
    }

    public int size() {
        // code here
       
        return rear+1;
    }
}