package traversal_algo;
import java.util.*;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
// TreeTraversalAlgo class implements a binary tree and traversal algorithms
class TreeTraversalAlgo {
    private Node root;// Root node of the binary tree
    private int size; // Number of nodes in the tree

    public TreeTraversalAlgo() {
        root = null;
        size = 0;
    }
    // Method to insert a new node with the specified value into the tree
    // The insertion is done in level order (breadth-first), filling nodes from left to right
    public void insrtNode(int value) {
        Node newNode = new Node(value);
        // If tree is empty, new node becomes root
        if (root == null) {
            root = newNode;
            size++;
            return;
        }
        // Use a queue to traverse the tree level by level
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            // If left child is missing, insert here
            if (current.left == null) {
                current.left = newNode;
                size++;
                return;
                // If right child is missing, insert here
            } else if (current.right == null) {
                current.right = newNode;
                size++;
                return;
            }
            // Oadd children to queue to check their children next

            queue.add(current.left);
            queue.add(current.right);
        }
    }
    // Checks if a value exists in the tree using level order traversal
    public boolean contains(int value) {
        if (root == null) {
            System.out.println("it is empty");
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // Traverse level by level until the value is found or the queue is empty
        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.value == value) {
                return true;
            }

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        // Value not found in tree
        return false;
    }

    // Returns number of edges on longest path from root to leaf
    public int getHeight() {
        return countHeight(root);
    }
//calculate height of subtree rooted at given node
    private int countHeight(Node node) {
        if (node == null) return -1;//empty subtree has height -1

        int leftHeight = countHeight(node.left);
        int rightHeight = countHeight(node.right);
        // Height of node is max height of left/right subtree plus one
        return Math.max(leftHeight, rightHeight) + 1;
    }
    // Returns the total number of nodes in the tree
    public int getNodeCount() {
        return size;
    }
    // Returns a list of values resulting from inorder traversal (Left, Root, Right)
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }
// method for inorder traversal
    private void inorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            inorderRecursive(node.left, result);
            result.add(node.value);
            inorderRecursive(node.right, result);
        }
    }
    // Returns a list of values from preorder traversal (Root, Left, Right)
    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }
    // Recursive helper method for preorder traversal
    private void preorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preorderRecursive(node.left, result);
            preorderRecursive(node.right, result);
        }
    }
    // Returns a list of values from postorder traversal (Left, Right, Root)
    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }
//  Method for postorder traversal
    private void postorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            postorderRecursive(node.left, result);
            postorderRecursive(node.right, result);
            result.add(node.value);
        }
    }
    // Returns a list of values from level order traversal (breadth first)

    public List<Integer> levelOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // Traverse the tree level by level
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            result.add(current.value);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return result;
    }


    // Checks if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }
    // Clears the entire tree
    public void clear() {
        root = null;
        size = 0;
    }
    // Displays all traversals of the tree in formatted output
    public void displayAllTraversals() {
        if (isEmpty()) {
            System.out.println("It is empty");
            return;
        }

        System.out.println("inorder: " + formatList(inorderTraversal()));
        System.out.println("preorder: " + formatList(preorderTraversal()));
        System.out.println("postorder: " + formatList(postorderTraversal()));
        System.out.println("levelorder: " + formatList(levelOrderTraversal()));
    }
    // Method to format the traversal list into a separated string

    private String formatList(List<Integer> list) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if (i < list.size() - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }

}

