package union_find;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        UnionFind uf = new UnionFind(size);

        uf.unite(1, 2);
        uf.unite(3, 4);

        boolean inSameSet1and2 = (uf.find(1) == uf.find(2));
        boolean inSameSet1and3 = (uf.find(1) == uf.find(3));
        boolean inSameSet3and4 = (uf.find(3) == uf.find(4));

        System.out.println("Are 1 and 2 in the same set? " + (inSameSet1and2 ? "Yes" : "No"));
        System.out.println("Are 1 and 3 in the same set? " + (inSameSet1and3 ? "Yes" : "No"));
        System.out.println("Are 3 and 4 in the same set? " + (inSameSet3and4 ? "Yes" : "No"));
    }
}
