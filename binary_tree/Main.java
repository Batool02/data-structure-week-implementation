package binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();

        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(3);
        myTree.insert(4);
        myTree.insert(5);
        myTree.insert(6);
        myTree.insert(7);
        myTree.insert(8);
        myTree.insert(10);



        System.out.println("Is it contain 7? " + myTree.search(7));
        System.out.println("Is it contain 11? " + myTree.search(11));

        System.out.println("Tree height: " +myTree.getHeight());

        System.out.println("Number of nodes in the tree: " + myTree.getNodeCount());
    }}
