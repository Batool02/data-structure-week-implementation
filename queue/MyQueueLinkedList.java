package queue;

public class MyQueueLinkedList {

        private static class Node {
            Object value;
            Node next;

            Node(Object value) {
                this.value = value;
            }
        }

        private Node front;
        private Node rear;
        private int size;

        public void push(Object value) {
            Node node = new Node(value);
            if (rear == null) {
                front = node;
                rear = node;
            } else {
                rear.next = node;
                rear = node;
            }
            size++;
        }

        public Object pop() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return null;
            }

            Object removed = front.value;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return removed;
        }

        public Object peekFront() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return null;
            }
            return front.value;
        }

        public boolean includes(Object value) {
            Node current = front;
            while (current != null) {
                if (current.value.equals(value)) return true;
                current = current.next;
            }
            return false;
        }

        public boolean removeValue(Object value) {
            if (front == null) return false;

            if (front.value.equals(value)) {
                pop();
                return true;
            }

            Node current = front;
            while (current.next != null) {
                if (current.next.value.equals(value)) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        rear = current;
                    }
                    size--;
                    return true;
                }
                current = current.next;
            }

            System.out.println("Element not found.");
            return false;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int length() {
            return size;
        }

        public void displayQueue() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return;
            }

            System.out.print("Start -> ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }
    }


