package stack;

public class MyStack {
    private int[] items;
    private int topIndex;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        items = new int[maxSize];
        topIndex = -1;
    }

    public void push(int value) {
        if (topIndex == maxSize - 1) {
            throw new IllegalStateException("Stack is full");
        }
        items[++topIndex] = value;
    }

    public int pop() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[topIndex--];
    }

    public int peek() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[topIndex];
    }

    public void show() {
        System.out.print("Stack content: ");
        if (topIndex == -1) {
            System.out.println("[]");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

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