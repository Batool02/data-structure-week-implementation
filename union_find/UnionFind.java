package union_find;

public class UnionFind {
    private int[] parent;
    private int[] rank; // to store the depth/size of each tree

    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];  // initially all ranks are 0
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int i) {
        if (parent[i] != i) {
            // path compression
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void unite(int i, int j) {
        int iRep = find(i);
        int jRep = find(j);

        if (iRep == jRep) return;

        // union by rank
        if (rank[iRep] < rank[jRep]) {
            parent[iRep] = jRep;
        } else if (rank[iRep] > rank[jRep]) {
            parent[jRep] = iRep;
        } else {
            parent[jRep] = iRep;
            rank[iRep]++;
        }
    }
}
