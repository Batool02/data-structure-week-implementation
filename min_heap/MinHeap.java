package min_heap;

import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void reorderDown(int i) {
        int theSmallest = i;
        int l = left(i);
        int r = right(i);

        if (l < heap.size() && heap.get(l) < heap.get(theSmallest)) {
            theSmallest = l;
        }

        if (r < heap.size() && heap.get(r) < heap.get(theSmallest)) {
            theSmallest = r;
        }

        if (theSmallest != i) {
            swap(i, theSmallest);
            reorderDown(theSmallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int index = heap.size() - 1;

        while (index > 0 && heap.get(parent(index)) > heap.get(index)) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public void deleteMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }

        int last = heap.size() - 1;
        heap.set(0, heap.get(last));
        heap.remove(last);
        reorderDown(0);
    }

    public int getMin() {
        if (!heap.isEmpty()) {
            return heap.get(0);
        } else {
            System.out.println("Heap is empty.");
            return -1;
        }
    }

    public void display() {
        System.out.print("Min Heap: ");
        for (int val : heap) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

}
