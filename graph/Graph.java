package graph;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> list;
    private int size;

    public Graph() {
        this.list = new HashMap<>();
        this.size = 0;
    }

    public void insertEdge(int u, int v) {
        if (!list.containsKey(u)) {
            list.put(u, new ArrayList<>());
            size++;
        }
        if (!list.containsKey(v)) {
            list.put(v, new ArrayList<>());
            size++;
        }
        if (!list.get(u).contains(v)) {
            list.get(u).add(v);
        }
        if (!list.get(v).contains(u)) {
            list.get(v).add(u);  // لأنو غير موجه
        }
    }

    public boolean search(int vertex) {
        if (list.isEmpty()) {
            System.out.println("The graph is empty");
            return false;
        }
        return list.containsKey(vertex);
    }

    public int getNodesCount() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        list.clear();
        size = 0;
    }

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