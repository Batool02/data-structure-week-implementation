package doubly_linked_list;



public class MyDoublyList {
    private class Node {
        int data;
        Node previous;//pointer to the previous node
        Node next; //pointer to the next node

        Node(int data) {
            this.data = data;
        }
    }


    private Node start;//points to the first node in the list
    private Node end;//points to the last node in the list
    private int totalCount;//keeps track of the number of nodes

    //constructor
    public MyDoublyList() {
        start = null;
        end = null;
        totalCount = 0;
    }


    //insert a new node at the beginning of the list
    public void insertAtFront(int value) {
        Node freshNode = new Node(value);//create a new node with the given value

        if (start == null) {
            //if list is empty, new node becomes both start and end

            start = freshNode;
            end = freshNode;
        } else {
            // Link the new node to the current start
            freshNode.next = start;
            start.previous = freshNode;
            start = freshNode;// Update start to the new node
        }
        totalCount++;// Increase node count
    }

    // Insert a new node at the end of the list
    public void insertLast(int value) {
        Node freshNode = new Node(value);

        if (start == null) {
            // If list is empty, new node becomes both start and end
            start = freshNode;
            end = freshNode;
        } else {
            // Link the current end node to the new node
            end.next = freshNode;
            freshNode.previous = end;
            end = freshNode; //update end to the new node
        }
        totalCount++;
    }




    //print all nodes in the list from start to end
    public void printList() {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = start;

        while (current != null) {
            System.out.print(current.data + "<->");// Print current node's data
            current = current.next;// Move to the next node
        }
        System.out.println("null");// end of the list
    }


    // Return the number of nodes in the list
    public int countItems() {
        return totalCount;
    }

    // Find and return the position of the node with the given value
    public int findPosition(int value) {
        if (start == null) {
            System.out.println("List is empty");
            return -1;
        }

        Node pointer = start;
        int index = 0;

        while (pointer != null) {
            if (pointer.data == value) return index; // the value is found
            pointer = pointer.next;
            index++;
        }

        return -1;// the value is not found
    }
}

