package linked_list;
// node class represents each node in the linked list

class Node {
    int data;// Data stored in the node
    Node link; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    private Node start; // Reference to the first node in the list
    private int count;// Number of elements in the list

    // constructor
    public LinkedList() {
        this.start = null;
        this.count = 0;
    }
    //returns the number of elements in the list
    public int getSize() {
        return count;
    }
    //inserts a new node at the end of the list

    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        //if the list is empty, new node becomes the first node

        if (start == null) {
            start = temp;
        } else {
            //traverse to the last node
            Node ptr = start;
            while (ptr.link != null) {
                ptr = ptr.link;
            }
            //link the new node to the end

            ptr.link = temp;
        }
        count++;//increase the size
    }
    //inserts a new node at the beginning of the list

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);// create a new node
        temp.link = start;//link it to the current first node
        start = temp;//make it the new first node
        count++;
    }
    //deletes the node at a specific position and returns its value

    public Integer deleteAt(int position) {
        if (position < 0 || position >= count) return null;// invalid index

        if (position == 0) {
            //if deleting the first node

            int val = start.data;
            start = start.link;
            count--;
            return val;
        }
        //traverse to the node just before the one to be deleted

        Node prev = start;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.link;
        }

        Node target = prev.link; //node to be deleted
        prev.link = target.link;
        count--;
        return target.data;
    }
    //finds and returns the index of a value in the list, or -1 if not found
    public int findIndex(int value) {
        Node current = start;
        int pos = 0;

        while (current != null) {
            if (current.data == value) {
                return pos; //value found
            }
            current = current.link;
            pos++;
        }

        return -1;//not found the value
    }
    //returns the value at a specific position in the list

    public Integer getValue(int position) {
        if (position < 0 || position >= count) return null;//invalid index

        Node temp = start;
        for (int i = 0; i < position; i++) {
            temp = temp.link;
        }

        return temp.data;
    }
    //displays the list

    public void display() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " , ");
            current = current.link;
        }
        System.out.println("null");
    }
}
