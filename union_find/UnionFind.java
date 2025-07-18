package union_find;

public class UnionFind {
    private int[] parent;  // array to store the parent of each element


    public UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;  //  each element is in its own set at first
        }
    }

    public int find(int i) {
        // if the element is its own parent, it is the root
        if (parent[i] == i) {
            return i;
        }
        // recursively find the representative of the parent
        return find(parent[i]);
    }


    public void unite(int i, int j) {
        int iRep = find(i); // find representative of i's set
        int jRep = find(j); // find representative of j's set

        // merge the two sets by pointing i's root to j's root
        if (iRep != jRep) {
            parent[iRep] = jRep;
        }
    }


}

