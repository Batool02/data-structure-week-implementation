package stack;

public class MyStack {
    private int[] items;// Array to store stack elements
    private int topIndex;// Index of the top element in the stack
    private int maxSize;// Maximum capacity of the stack
    public MyStack(int size) {
        //constructer
        maxSize = size;
        items = new int[maxSize];
        topIndex = -1;
    }
    // Pushes a new value onto the top of the stack

    public void push(int value) {
        if (topIndex == maxSize - 1) {
            throw new IllegalStateException("Stack is full");
        }
        items[++topIndex] = value;// Increment topIndex, then store value
    }
    // Removes and returns the top value from the stack
    public int pop() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[topIndex--];// Return top value, then decrement topIndex
    }
    // Returns the top value without removing it

    public int peek() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[topIndex]; // Just return the top value
    }
    // Displays all elements in the stack from bottom to top
    public void show() {
        System.out.print("Stack content: ");
        if (topIndex == -1) {
            System.out.println("[]");// Stack is empty
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }
//test the methods here
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.show();
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        stack.show();
        System.out.println("Top element: " + stack.peek());
    }
}