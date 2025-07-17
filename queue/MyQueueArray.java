package queue;



public class MyQueueArray {
    private Object[] storage;
    private int count;

    public MyQueueArray() {
        this.storage = new Object[8];
        this.count = 0;
    }

    public void push(Object element) {
        if (count == storage.length) {
            grow();
        }
        storage[count++] = element;
    }

    public Object pop() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return null;
        }

        Object front = storage[0];

        for (int i = 1; i < count; i++) {
            storage[i - 1] = storage[i];
        }

        count--;
        storage[count] = null;
        return front;
    }

    public Object peekFront() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return null;
        }
        return storage[0];
    }

    public boolean includes(Object element) {
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) return true;
        }
        return false;
    }

    public boolean removeValue(Object element) {
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) {
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

    public boolean isEmpty() {
        return count == 0;
    }

    public int length() {
        return count;
    }

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

    private void grow() {
        Object[] expanded = new Object[storage.length * 2];
        System.arraycopy(storage, 0, expanded, 0, count);
        storage = expanded;
    }
}
