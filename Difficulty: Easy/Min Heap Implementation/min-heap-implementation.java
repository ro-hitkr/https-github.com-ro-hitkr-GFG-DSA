class MinHeap {

        ArrayList<Integer> arr = new ArrayList<>();
    // Constructor
    public MinHeap() {
        // Initialize your data members
        arr = new ArrayList<>();
    }

    public void push(int x) {
        // Insert x into the heap
        arr.add(x);
        
        int xx = arr.size()-1;
        
       while(xx>0){
        int par = (xx-1)/2;
             if (arr.get(xx) < arr.get(par)) {
                             int temp = arr.get(xx);
                             arr.set(xx, arr.get(par));
                             arr.set(par, temp);

                             xx = par;
                         } else {
                             break; // Heap property is satisfied, stop bubbling up
                         }
          }
        
    }
private void heapify(int i){
    int left = 2*i+1;
    int right = 2*i+2;
    int mindidx = i;

    if(left<arr.size() && arr.get(mindidx) > arr.get(left)){
        mindidx = left;
    }

    if(right<arr.size() && arr.get(mindidx) > arr.get(right)){
        mindidx = right;
    }

    if(mindidx != i){
        int temp = arr.get(i);
        arr.set(i,arr.get(mindidx));
        arr.set(mindidx, temp);

        heapify(mindidx);
    }
}
    public int pop() {
        // Remove the top (minimum) element
        if (arr.isEmpty()) {
                    return -1;
                }
        int data = arr.get(0);
           //swap
           int temp = arr.get(0);
           arr.set(0, arr.get(arr.size()-1));
           arr.set(arr.size()-1, temp);

           //delete last
           arr.remove(arr.size()-1);

           //heapify
           heapify(0);
           return data;
    }

    public int peek() {
        if (arr.isEmpty()) {
                    return -1;
                }
        // Return the top element or -1 if empty
        return arr.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return arr.size();
    }
}