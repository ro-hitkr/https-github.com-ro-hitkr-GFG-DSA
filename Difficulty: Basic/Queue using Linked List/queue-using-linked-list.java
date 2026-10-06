// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
   static Node head = null;
      static Node tail = null;
       

    public myQueue() {
        // Initialize your data members
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        // check if the queue is empty
       return head == null && tail == null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()){
            return;
        }
        int front = head.data;
        if(tail==head){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        int l = 0;
        Node temp = head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        return l;
    }
}
