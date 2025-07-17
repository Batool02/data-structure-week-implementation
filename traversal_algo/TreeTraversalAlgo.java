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

class TreeTraversalAlgo {
    private Node root;
    private int size;

    public TreeTraversalAlgo() {
        root = null;
        size = 0;
    }

    public void insrtNode(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            size++;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
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

    public boolean contains(int value) {
        if (root == null) {
            System.out.println("it is empty");
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
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

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            inorderRecursive(node.left, result);
            result.add(node.value);
            inorderRecursive(node.right, result);
        }
    }

    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    private void preorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preorderRecursive(node.left, result);
            preorderRecursive(node.right, result);
        }
    }

    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    private void postorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            postorderRecursive(node.left, result);
            postorderRecursive(node.right, result);
            result.add(node.value);
        }
    }

    public List<Integer> levelOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            result.add(current.value);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return result;
    }



    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
        size = 0;
    }

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

