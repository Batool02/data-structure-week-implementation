package min_heap;

import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        //the heap is stored as a dynamic array
        heap = new ArrayList<>();
    }
    //returns the index of the parent of the node at index i
    private int parent(int i) {
        return (i - 1) / 2;
    }

    //returns the index of the left child of the node at index i
    private int left(int i) {
        return 2 * i + 1;
    }

    //returns the index of the right child of the node at index i
    private int right(int i) {
        return 2 * i + 2;
    }

    //maintains the min heap property by moving the value at index i down
    private void reorderDown(int i) {
        int theSmallest = i;
        int l = left(i);
        int r = right(i);
        //compare with left child
        if (l < heap.size() && heap.get(l) < heap.get(theSmallest)) {
            theSmallest = l;
        }

        //compare with right child
        if (r < heap.size() && heap.get(r) < heap.get(theSmallest)) {
            theSmallest = r;
        }

        //if a smaller child was found, swap and continue
        if (theSmallest != i) {
            swap(i, theSmallest);
            reorderDown(theSmallest);
        }
    }

    //swaps two elements in the heap by index
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    //inserts a new value into the heap and reorders it upwards
    public void insert(int value) {
        heap.add(value);// Add at the end
        int index = heap.size() - 1;

        //move up while parent is greater than the new value
        while (index > 0 && heap.get(parent(index)) > heap.get(index)) {
            swap(index, parent(index));
            index = parent(index);//move to parent index
        }
    }

    //deletes the minimum element the root, from the heap
    public void deleteMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }

        int last = heap.size() - 1;
        //replace root with last element, remove last, and reorder
        heap.set(0, heap.get(last));
        heap.remove(last);
        reorderDown(0);// Restore heap property
    }

    //returns the minimum value (at the root) without removing it
    public int getMin() {
        if (!heap.isEmpty()) {
            return heap.get(0);
        } else {
            System.out.println("Heap is empty.");
            return -1;
        }
    }

    //displays the heap elements
    public void display() {
        System.out.print("Min Heap: ");
        for (int val : heap) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    //checks if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

}
