package bst;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private Node root;//root node of the tree
    private int size; //tracks the total number of nodes

    //constructor
    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    //inserts a new value into the BST
    public void insert(int value) {
        //if the tree is empty, set root to the new node
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            //insert the new node in the correct position
            insertRecursive(root, newNode);
        }

        size++;//increase the count of nodes
    }

    //recursively insert the new node
    private void insertRecursive(Node current, Node newNode) {
        if (newNode.value < current.value) {
            // Go to the left subtree
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertRecursive(current.left, newNode);
            }
        } else {
            //go to the right subtree
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertRecursive(current.right, newNode);
            }
        }
    }
    //checks whether a value exists in the BST
    public boolean contains(int value) {
        if (root == null) {
            System.out.println("It is empty");
            return false;
        }
        return containsRecursive(root, value);
    }

    //search for a value recursively
    private boolean containsRecursive(Node current, int value) {
        if (current == null) return false;

        if (value == current.value) {
            return true;
        } else if (value < current.value) {
            return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }

    //returns the height of the tree
    public int getHeight() {
        return countHeight(root);
    }
//recursively count height
    private int countHeight(Node node) {
        if (node == null) return -1;

        int leftHeight = countHeight(node.left);
        int rightHeight = countHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    //returns the total number of nodes in the tree
    public int getNodeCount() {
        return size;
    }

    //checks if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    //clears the entire tree
    public void clearTree() {
        root = null;
        size = 0;
    }
}
