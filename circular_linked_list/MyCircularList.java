package circular_linked_list;

public class MyCircularList {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    private Node first;//points to the first node in the list
    private Node last;//points to the last node in the list
    private int count;//keeps track of the number of nodes

    public MyCircularList() {
        first = null;
        last = null;
        count = 0;
    }
    //insert a node at the beginning of the list

    public void insertStart(int value) {
        Node fresh = new Node(value);//create new node

        if (first == null) {
            //list is empty so the new node is both first and last
            first = fresh;
            last = fresh;
            fresh.next = fresh;//circular link to itself
        } else {
            fresh.next = first; //new node points to current first
            first = fresh;      //update first to new node
            last.next = first;  //last node now points to new first
        }
        count++;
    }
    //insert a node at the end of the list

    public void insertEnd(int value) {
        Node fresh = new Node(value);//create a new node

        if (first == null) {
            //list is empty: new node is both first and last
            first = fresh;
            last = fresh;
            fresh.next = fresh;
        } else {
            fresh.next = first;//new node points to first
            last.next = fresh;//last node points to new node
            last = fresh;//update last to new node
        }
        count++;
    }
    //find the position of a node with a specific value

    public int locateIndex(int value) {
        if (first == null) {
            System.out.println("the list is empty");
            return -1;
        }

        Node temp = first;
        int pos = 0;

        do {
            if (temp.data == value) return pos;// value found
            temp = temp.next;
            pos++;
        } while (temp != first);//loop unitl we're back to the start

        return -1;// value not found
    }

    // print all nodes in the list
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
        } while (current != first);//loop until we're back to the start

        System.out.println("(back to " + first.data + ")");
    }
    //return the total number of nodes in the list

    public int totalNodesCount() {
        return count;
    }
}

