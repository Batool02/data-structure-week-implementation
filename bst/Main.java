package bst;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);
        bst.insert(11);

        System.out.println("Is it contain 5? " + bst.contains(5));

        System.out.println("Is it contain 55? " + bst.contains(55));
        System.out.println(" is  it empty? " + bst.isEmpty());

        System.out.println("the height= " + bst.getHeight());

        System.out.println("Number of nodes in the tree: " + bst.getNodeCount());


        bst.clearTree();
        System.out.println(" is  it empty?" + bst.isEmpty());
    }
}

