package linked_list;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    private Node start;
    private int count;

    public LinkedList() {
        this.start = null;
        this.count = 0;
    }

    public int getSize() {
        return count;
    }

    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (start == null) {
            start = temp;
        } else {
            Node ptr = start;
            while (ptr.link != null) {
                ptr = ptr.link;
            }
            ptr.link = temp;
        }
        count++;
    }

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        temp.link = start;
        start = temp;
        count++;
    }

    public Integer deleteAt(int position) {
        if (position < 0 || position >= count) return null;

        if (position == 0) {
            int val = start.data;
            start = start.link;
            count--;
            return val;
        }

        Node prev = start;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.link;
        }

        Node target = prev.link;
        prev.link = target.link;
        count--;
        return target.data;
    }

    public int findIndex(int value) {
        Node current = start;
        int pos = 0;

        while (current != null) {
            if (current.data == value) {
                return pos;
            }
            current = current.link;
            pos++;
        }

        return -1;
    }

    public Integer getValue(int position) {
        if (position < 0 || position >= count) return null;

        Node temp = start;
        for (int i = 0; i < position; i++) {
            temp = temp.link;
        }

        return temp.data;
    }

    public void display() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " , ");
            current = current.link;
        }
        System.out.println("null");
    }
}
