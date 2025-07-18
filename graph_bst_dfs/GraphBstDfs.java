package graph_bst_dfs;

import java.util.*;

public class GraphBstDfs {
    // Adjacency list to represent the graph
    private Map<String, List<String>> adjList;

    // constructor
    public GraphBstDfs () {
        adjList = new HashMap<>();
    }

    // add a vertex to the graph
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // add a directed edge from 'from' to 'to'
    public void addEdge(String from, String to) {
        addVertex(from); // ensure both vertices exist
        addVertex(to);
        adjList.get(from).add(to); // add the edge
    }

    // display the graph structure
    public void display() {
        System.out.println("the structure:");
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " > " + adjList.get(vertex));
        }
    }

    // perform BFS traversal from a starting node
    public List<String> bfs(String start) {
        Set<String> visited = new HashSet<>();       // to track visited nodes
        Queue<String> queue = new LinkedList<>();    // queue for BFS
        List<String> result = new ArrayList<>();     // result of traversal

        queue.offer(start); // enqueue starting node

        while (!queue.isEmpty()) {
            String current = queue.poll(); // dequeue current node

            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);

                // enqueue all unvisited neighbors
                for (String neighbor : adjList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return result;
    }

    // perform DFS traversal from a starting node
    public List<String> dfs(String start) {
        Set<String> visited = new HashSet<>();       // track visited nodes
        List<String> result = new ArrayList<>();     // result of traversal

        dfsRecursive(start, visited, result);        // start recursive DFS
        return result;
    }

    //  method for recursive DFS
    private void dfsRecursive(String node, Set<String> visited, List<String> result) {
        if (!visited.contains(node)) {
            visited.add(node);
            result.add(node);

            // recursively visit all neighbors
            for (String neighbor : adjList.get(node)) {
                dfsRecursive(neighbor, visited, result);
            }
        }
    }
}

