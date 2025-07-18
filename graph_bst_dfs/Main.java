package graph_bst_dfs;

public class Main {
    public static void main(String[] args) {
        GraphBstDfs  myGraph = new  GraphBstDfs();

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "E");
        myGraph.addEdge("D", "F");

        myGraph.display();

        System.out.println("BFS starting from A: " + myGraph.bfs("A"));
        System.out.println("DFS starting from A: " + myGraph.dfs("A"));
    }
}

