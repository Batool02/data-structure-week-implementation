package union_find;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        UnionFind uf = new UnionFind(size);

        uf.unite(1, 2);
        uf.unite(3, 4);

        boolean inSameSet = (uf.find(1) == uf.find(2));


        System.out.println("Are 1 and 2 in the same set? " + (inSameSet ? "Yes" : "No"));
    }


}
