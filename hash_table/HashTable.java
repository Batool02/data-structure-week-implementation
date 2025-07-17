package hash_table;

import java.util.*;

class HashTable {
    private int bucket;
    private List<LinkedList<Integer>> table;

    public HashTable(int bucketCount) {
        bucket = bucketCount;
        table = new ArrayList<>(bucket);

        for (int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }
    }

    private int hashFunction(int key) {
        return key % bucket;
    }

    public void insertItem(int key) {
        int index = hashFunction(key);
        table.get(index).add(key);
    }

    public void deleteItem(int key) {
        int index = hashFunction(key);
        LinkedList<Integer> chain = table.get(index);

        chain.removeFirstOccurrence(key);
    }

    public void displayHash() {
        for (int i = 0; i < bucket; i++) {
            System.out.print(i);
            for (int key : table.get(i)) {
                System.out.print(" > " + key);
            }
            System.out.println();
        }
    }
}

