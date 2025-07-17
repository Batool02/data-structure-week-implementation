package min_heap;
public class Main{

public static void main(String[] args){
    MinHeap myHeap = new MinHeap();
    int[] values = { 1, 7, 11, 12,15,48,97 };

    for (int val : values) {
        myHeap.insert(val);
        System.out.print("Inserted " + val + ": ");
        myHeap.display();
    }

    System.out.println("Minimum element: " + myHeap.getMin());
    myHeap.deleteMin();
    System.out.print("After deleting min: ");
    myHeap.display();
}}


