package queue;



public class MyQueueArray {
    private Object[] storage; // Internal array to store queue elements
    private int count;// Number of elements currently in the queue
//constructor
    public MyQueueArray() {

        this.storage = new Object[8];
        this.count = 0;
    }
    // Adds an element to the end  of the queue

    public void push(Object element) {
        if (count == storage.length) {
            grow();// If full, increase capacity
        }
        storage[count++] = element;
    }
    // Removes and returns the head element from the queue

    public Object pop() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return null;
        }

        Object head = storage[0];// Save the head element
        // Shift all elements one position to the left

        for (int i = 1; i < count; i++) {
            storage[i - 1] = storage[i];
        }

        count--;// Decrease count
        storage[count] = null;// clear the last item
        return head; // Return the removed element
    }
    // Returns the head element without removing it

    public Object peekHead() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return null;
        }
        return storage[0];
    }
    // Checks if a given element exists in the queue

    public boolean includes(Object element) {
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) return true;
        }
        return false;
    }
    // Removes a specific element from the queue if it exists

    public boolean removeValue(Object element) {
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) {
                // Shift elements left to remove the target
                for (int j = i; j < count - 1; j++) {
                    storage[j] = storage[j + 1];
                }
                count--;
                storage[count] = null;
                return true;
            }
        }
        System.out.println("Element not found.");
        return false;
    }
    // Returns true if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }
    // Returns the number of elements in the queue
    public int length() {
        return count;
    }
    // Prints all elements in the queue from head to rear
    public void displayQueue() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Start -> ");
        for (int i = 0; i < count; i++) {
            System.out.print(storage[i] + " -> ");
        }
        System.out.println("End");
    }
    // Doubles the capacity of the storage array when full
    private void grow() {
        Object[] expanded = new Object[storage.length * 2];
        System.arraycopy(storage, 0, expanded, 0, count);// Copy existing elements
        storage = expanded;// Replace old array with new larger one
    }
}
