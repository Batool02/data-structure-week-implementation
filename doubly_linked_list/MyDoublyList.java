package doubly_linked_list;



public class MyDoublyList {
    private class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node start;
    private Node end;
    private int totalCount;

    public MyDoublyList() {
        start = null;
        end = null;
        totalCount = 0;
    }


    public void insertAtFront(int value) {
        Node freshNode = new Node(value);

        if (start == null) {
            start = freshNode;
            end = freshNode;
        } else {
            freshNode.next = start;
            start.previous = freshNode;
            start = freshNode;
        }
        totalCount++;
    }


    public void insertLast(int value) {
        Node freshNode = new Node(value);

        if (start == null) {
            start = freshNode;
            end = freshNode;
        } else {
            end.next = freshNode;
            freshNode.previous = end;
            end = freshNode;
        }
        totalCount++;
    }




    public void printList() {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = start;

        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }


    public int countItems() {
        return totalCount;
    }

    public int findPosition(int value) {
        if (start == null) {
            System.out.println("List is empty");
            return -1;
        }

        Node pointer = start;
        int index = 0;

        while (pointer != null) {
            if (pointer.data == value) return index;
            pointer = pointer.next;
            index++;
        }

        return -1;
    }
}

