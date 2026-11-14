import java.util.ArrayList;

class maxHeap {
    ArrayList<Integer> arr = new ArrayList<>();

    // Constructor
    public maxHeap() {
        arr = new ArrayList<>();
    }

    public void push(int x) {
        // Insert x into the heap
        arr.add(x);

        int xx = arr.size() - 1;

        // Fix 1: while xx > 0 (instead of xx < 0)
        // Fix 2: compare with > for max-heap property
        while (xx > 0) {
            int par = (xx - 1) / 2;
            if (arr.get(xx) > arr.get(par)) {
                int temp = arr.get(xx);
                arr.set(xx, arr.get(par));
                arr.set(par, temp);

                xx = par;
            } else {
                break; // Heap property is satisfied, stop bubbling up
            }
        }
    }

    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < arr.size() && arr.get(largest) < arr.get(left)) {
            largest = left;
        }

        if (right < arr.size() && arr.get(largest) < arr.get(right)) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);

            heapify(largest);
        }
    }

    // Fix 3: Change return type from void to int
    public int pop() {
        // Remove the top (maximum) element
        if (arr.isEmpty()) {
            return -1;
        }

        int data = arr.get(0);

        // Swap root with the last element
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // Delete last
        arr.remove(arr.size() - 1);

        // Heapify from root
        if (!arr.isEmpty()) {
            heapify(0);
        }

        return data;
    }

    public int peek() {
        // Return the top element or -1 if empty
        if (arr.isEmpty()) {
            return -1;
        }
        return arr.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return arr.size();
    }
}