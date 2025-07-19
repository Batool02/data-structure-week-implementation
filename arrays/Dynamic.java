package arrays;

public class Dynamic {
    private int[] array; // Internal array to store elements

    private int size;// Number of elements in the array
    private int capacity;// Current capacity of the array


    // Constructor
    public Dynamic() {
        capacity = 2;
        array = new int[capacity];
        size = 0;
    }
    // Adds an element to the end of the array, resizes if needed

    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        array[size++] = element;
    }
    // Returns the element at the specified index

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        return array[index];
    }
    // Removes the last element from the array

    public void remove() {
        if (size == 0) {
            throw new IllegalStateException("Cannot remove from an empty array");
        }
        array[size - 1] = 0;
        size--;
    }
    // Returns the current number of elements

    public int size() {
        return size;
    }
    // Returns true if the array is empty

    public boolean isEmpty() {
        return size == 0;
    }
    // Prints all elements in the array
    public void print() {
        System.out.print("Array: ");
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    // Doubles the capacity of the internal array

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];// Copy old elements to new array
        }
        array = newArray;// Replace old array with new array
    }
// in the main  i test the methods to ensure if they work
    public static void main(String[] args) {
        Dynamic myArray = new Dynamic();
        myArray.add(5);
        myArray.add(15);
        myArray.add(25);
        myArray.add(35);
        System.out.println("After adding 5, 15, 25, 35:");
        myArray.print();
        try {
            System.out.println("Element at index 1: " + myArray.get(1));
            System.out.println("Element at index 3: " + myArray.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        myArray.remove();
        System.out.println("After removing one element:");
        myArray.print();
        System.out.println("Current size: " + myArray.size());
        try {
            System.out.println("Trying to access index 10:");
            myArray.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        myArray.remove();
        myArray.remove();
        myArray.remove();
        try {
            System.out.println("Trying to remove from empty array:");
            myArray.remove();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Is array empty? " + myArray.isEmpty());
        myArray.print();
    }
}
