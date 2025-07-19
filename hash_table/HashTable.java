package hash_table;

import java.util.*;

class HashTable {
    private int bucket;//Number of buckets in the hash table
    private List<LinkedList<Integer>> table;// Array of linked lists for chaining


    public HashTable(int bucketCount) {
        bucket = bucketCount;
        table = new ArrayList<>(bucket);
        // Initialize each bucket with an empty linked list
        for (int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }
    }
    // hash function to determine the bucket index for a given key
    private int hashFunction(int key) {
        return key % bucket;
    }
    //insert a key into the hash table
    public void insertItem(int key) {
        int index = hashFunction(key);//get bucket index for the key
        table.get(index).add(key); //add key to the corresponding linked list
    }
    // delete a key from the hash table if it exists
    public void deleteItem(int key) {
        int index = hashFunction(key); //get bucket index for the key
        LinkedList<Integer> chain = table.get(index);//get the linked list at that index

        chain.removeFirstOccurrence(key); //remove the first occurrence of the key
    }
    // Display the contents of the hash table
    public void displayHash() {
        for (int i = 0; i < bucket; i++) {
            System.out.print(i);//print the bucket index
            for (int key : table.get(i)) {
                System.out.print(" > " + key);//print keys stored in the current bucket
            }
            System.out.println(); //move to the next line for the next bucket
        }
    }
}

