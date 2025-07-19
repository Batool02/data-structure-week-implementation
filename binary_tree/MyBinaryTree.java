package binary_tree;
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

class BinaryTree {
    private Node root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    // Insert a node in level order { left to right}
    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {

            root = newNode;
            size++;
            return;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.left == null) {
                current.left = newNode;
                size++;
                return;
            } else if (current.right == null) {
                current.right = newNode;
                size++;
                return;
            }

            queue.add(current.left);
            queue.add(current.right);
        }
    }
    // Search for a value using BFS
    public boolean search(int value) {
        if (root == null) {
            System.out.println("The tree is empty");
            return false;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
           Node current = queue.remove();

            if (current.value == value) {
                return true;
            }

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return false;
    }
    // Get the height of the tree
    public int getHeight() {
        return getHeightRecursive(root);
    }
    // Recursive  for height calculation

    private int getHeightRecursive(Node node) {
        if (node == null) return -1; //empty tree has height -1

        int leftHeight = getHeightRecursive(node.left);
        int rightHeight = getHeightRecursive(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    // Return total number of nodes
    public int getNodeCount() {
        return size;
    }
}



