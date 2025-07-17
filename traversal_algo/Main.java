package traversal_algo;

public class Main {
    public static void main(String[] args) {
        TreeTraversalAlgo tree = new TreeTraversalAlgo();

        tree.insrtNode(10);
        tree.insrtNode(1);
        tree.insrtNode(20);
        tree.insrtNode(2);
        tree.insrtNode(30);
        tree.insrtNode(3);
        tree.insrtNode(14);
        tree.insrtNode(24);
        tree.insrtNode(8);
        tree.insrtNode(88);



        System.out.println("Is it contain 30?" + tree.contains(30));

        System.out.println("Is it contain 85? " + tree.contains(85));

        System.out.println("The height=" + tree.getHeight());

        tree.displayAllTraversals();


    }
}
