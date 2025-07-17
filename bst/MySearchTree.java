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
    private Node root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            insertRecursive(root, newNode);
        }

        size++;
    }

    private void insertRecursive(Node current, Node newNode) {
        if (newNode.value < current.value) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertRecursive(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertRecursive(current.right, newNode);
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            System.out.println("It is empty");
            return false;
        }
        return containsRecursive(root, value);
    }

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

    public int getHeight() {
        return countHeight(root);
    }

    private int countHeight(Node node) {
        if (node == null) return -1;

        int leftHeight = countHeight(node.left);
        int rightHeight = countHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getNodeCount() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clearTree() {
        root = null;
        size = 0;
    }
}
