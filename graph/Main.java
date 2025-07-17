package graph;

public class Main {


    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.insertEdge(1,2);


        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 4);
        graph.insertEdge(4, 5);


        System.out.println("the graph is:");
        graph.printGraph();


        System.out.println("Number of vertices in the graph: " + graph.getNodesCount());

        System.out.println("Graph is empty: " + graph.isEmpty());



}
}
