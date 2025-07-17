package hash_table;

public class Main {
    public static void main(String[] args) {
        int[] keys = { 1, 11, 2, 22, 3, 33, 4, 44 };

        HashTable hashTable = new HashTable(8);
        for (int key : keys) {
            hashTable.insertItem(key);
        }

        hashTable.deleteItem(1);
        hashTable.displayHash();
    }
}

