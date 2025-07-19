package queue;

public class MyQueueLinkedList {
    // Inner Node class to store value and reference to next node

        private static class Node {
            Object value;
            Node next;

            Node(Object value) {
                this.value = value;
            }
        }

        private Node head;// Points to the  head of the queue
        private Node tail;// Points to the  tail of the queue
        private int size;// Number of elements in the queue

    // Adds an element to the end of the queue
    public void push(Object value) {
            Node node = new Node(value);
            if (tail == null) {
                // Queue is empty, so head and tail both point to the new node

                head = node;
                tail = node;
            } else {
                tail.next = node;// Link new node after tail
                tail = node; // Update tail to new node
            }
            size++;
        }
    // Removes and returns the head element of the queue

        public Object pop() {
            if (head == null) {
                System.out.println("Queue is empty.");
                return null;
            }

            Object removed = head.value;// Save value to return
            head = head.next; // Move head to next node
            if (head == null) {
                tail = null; // If queue is now empty, reset tail too
            }
            size--;
            return removed;
        }
    // Returns the head element without removing it

        public Object peekHead() {
            if (head == null) {
                System.out.println("Queue is empty.");
                return null;
            }
            return head.value;
        }
    // Checks whether a value exists in the queue

        public boolean includes(Object value) {
            Node current = head;
            while (current != null) {
                if (current.value.equals(value)) return true;
                current = current.next;
            }
            return false;
        }

    // Removes the first occurrence of a value from the queue
    public boolean removeValue(Object value) {
            if (head == null) return false;
        // If the value is at the head

            if (head.value.equals(value)) {
                pop();
                return true;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.value.equals(value)) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        tail = current; // If we removed the last node, update tail
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
            if (head == null) {
                System.out.println("Queue is empty.");
                return;
            }

            System.out.print("Start -> ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }
    }


