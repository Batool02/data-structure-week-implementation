package graph;

import java.util.*;

public class Graph {
    //Adjacency list representation of the graph
    private Map<Integer, List<Integer>> list;
    private int size;//Number of unique vertices in the graph
//Constructor
    public Graph() {
        this.list = new HashMap<>();
        this.size = 0;
    }
     //Inserts an edge between two vertices u and v
    public void insertEdge(int u, int v) {
        // If vertex u is not already in the graph add it
        if (!list.containsKey(u)) {
            list.put(u, new ArrayList<>());
            size++;
        }
        // If vertex v is not already in the graph, add it
        if (!list.containsKey(v)) {
            list.put(v, new ArrayList<>());
            size++;
        }
        // Add edge from u to v if not already present
        if (!list.get(u).contains(v)) {
            list.get(u).add(v);
        }
        // Add edge from v to u since it's an undirected graph

        if (!list.get(v).contains(u)) {
            list.get(v).add(u);
        }
    }
     // Searches for a vertex in the graph.
    public boolean search(int vertex) {
        if (list.isEmpty()) {
            System.out.println("The graph is empty");
            return false;
        }
        return list.containsKey(vertex);
    }
     // Returns the number of nodes in the graph.
    public int getNodesCount() {
        return size;
    }
    //checks whether the graph is empty
    public boolean isEmpty() {
        return size == 0;
    }
//Removes all vertices and edges from the graph
    public void clear() {
        list.clear();
        size = 0;
    }
//Prints the adjacency list of the graph,each line shows a vertex and its neighbors
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : list.entrySet()) {
            System.out.print(entry.getKey() + " > ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}