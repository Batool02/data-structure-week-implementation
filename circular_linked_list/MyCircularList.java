package circular_linked_list;

public class MyCircularList {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    public MyCircularList() {
        first = null;
        last = null;
        count = 0;
    }

    public void insertStart(int value) {
        Node fresh = new Node(value);

        if (first == null) {
            first = fresh;
            last = fresh;
            fresh.next = fresh;
        } else {
            fresh.next = first;
            first = fresh;
            last.next = first;
        }
        count++;
    }

    public void insertEnd(int value) {
        Node fresh = new Node(value);

        if (first == null) {
            first = fresh;
            last = fresh;
            fresh.next = fresh;
        } else {
            fresh.next = first;
            last.next = fresh;
            last = fresh;
        }
        count++;
    }

    public int locateIndex(int value) {
        if (first == null) {
            System.out.println("the list is empty");
            return -1;
        }

        Node temp = first;
        int pos = 0;

        do {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        } while (temp != first);

        return -1;
    }

    public void showAll() {
        if (first == null) {
            System.out.println(" the list is empty");
            return;
        }

        Node current = first;
        System.out.print("CIRCLE: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != first);

        System.out.println("(back to " + first.data + ")");
    }

    public int totalNodesCount() {
        return count;
    }
}

