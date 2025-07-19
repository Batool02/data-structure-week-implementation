# data-structure-week-implementation

## Overview
This repository contains implementations of fundamental data structures. Each data structure is designed to efficiently solve specific problems. This document provides clear descriptions, complexity analyses, and practical examples to help understand their usage.

## Data Structures Included

### Dynamic Array
A flexible list that grows or shrinks as needed, ideal for storing data when the size isn’t fixed.

### Singly Linked List
A sequence of nodes where each node holds data and points to the next, allowing sequential access.

### Stack (Array & Linked List Implementation)
A linear structure following First-In, Last-Out (FILO), similar to a stack of plates where you add or remove from the top.

### Doubly Linked List
Nodes linked both forward and backward, enabling two-way traversal.

### Circular Linked List
A linked list where the last node points back to the first, forming a loop.

### Queue
A linear structure using enqueue (add to back) and dequeue (remove from front), mimicking real-world queues.

### Binary Tree
Hierarchical tree structure where each node has up to two children.

### Binary Search Tree (BST)
A binary tree where left subtree values are less than the node, and right subtree values are greater or equal, enabling efficient search and insertion.

### Tree Traversal Algorithms
Methods to visit all nodes in specific orders: inorder, preorder, postorder, and level-order.

### Hash Table
Stores key value pairs using hashing with collision handling via chaining.

### Min Heap
Complete binary tree stored as an array, ensuring the smallest value is always on top.

### Basic Graph (Adjacency List)
Represents vertices and their edges using adjacency lists, modeling connections like social networks.

## Time and Space Complexity Summary

## Dynamic Array:

| Method      | Time Complexity             | Space Complexity |
| ----------- | --------------------------- | ---------------- |
|  add()      | O(1) amortized / O(n) worst | O(1)             |
|  get()      | O(1)                        | O(1)             |
|  remove()   | O(1)                        | O(1)             |
|  size()     | O(1)                        | O(1)             |
|  isEmpty()  | O(1)                        | O(1)             |
|  print()    | O(n)                        | O(1)             |
|  resize()   | O(n)                        | O(n)             |

## Stack :

| Method        | Time Complexity | Space Complexity |
| ------------- | --------------- | ---------------- |
|  push()       | O(1)            | O(1)             |
|  pop()        | O(1)            | O(1)             |
|  peek()       | O(1)            | O(1)             |
|  show()       | O(n)            | O(1)             |

## Linked list:

| Method                | Time Complexity | Space Complexity |
| --------------------- | --------------- | ---------------- |
|  getSize()            | O(1)            | O(1)             |
|  insertAtEnd()        | O(n)            | O(1)             |
|  insertAtBeginning()  | O(1)            | O(1)             |
|  deleteAt(position)   | O(n)            | O(1)             |
|  findIndex(value)     | O(n)            | O(1)             |
|  getValue(position)   | O(n)            | O(1)             |
|  display()            | O(n)            | O(1)             |

## Circular linked list

| **Method**          | **Time Complexity** | **Space Complexity** |
| ------------------- | ------------------- | -------------------- |
|  insertStart(int)   | O(1)                | O(1)                 |
|  insertEnd(int)     | O(1)                | O(1)                 |
|  locateIndex(int)   | O(n)                | O(1)                 |
|  showAll()          | O(n)                | O(1)                 |
|  totalNodesCount()  | O(1)                | O(1)                 |

## Doubly linked list

| **Method**           | **Time Complexity** | **Space Complexity** |
| -------------------- | ------------------- | -------------------- |
| `insertAtFront(int)` | O(1)                | O(1)                 |
| `insertLast(int)`    | O(1)                | O(1)                 |
| `printList()`        | O(n)                | O(1)                 |
| `countItems()`       | O(1)                | O(1)                 |
| `findPosition(int)`  | O(n)                | O(1)                 |


## Queue

| Method           | Time Complexity             | Space Complexity |
| ---------------- | --------------------------- | ---------------- |
|  push()          | O(1) amortized / O(n) worst | O(1)             |
|  pop()`          | O(n)                        | O(1)             |
|  peekHead()      | O(1)                        | O(1)             |
|  includes()      | O(n)                        | O(1)             |
|  removeValue()   | O(n)                        | O(1)             |
|  isEmpty()       | O(1)                        | O(1)             |
|  length()        | O(1)                        | O(1)             |
|  displayQueue()  | O(n)                        | O(1)             |
|  grow()          | O(n)                        | O(n)             |


## BinaryTree :

| Method                     | Time Complexity | Space Complexity |
| -------------------------- | --------------- | ---------------- |
|  insert(int value)         | O(n)            | O(n)             |
|  search(int value)         | O(n)            | O(n)             |
|  getHeight()               | O(n)            | O(h)             |
|  getHeightRecursive(Node)  | O(n)            | O(h)             |
|  getNodeCount()            | O(1)            | O(1)             |

## BST

| **Method**       | **Time Complexity**       | **Space Complexity**                          |
| ---------------- | ------------------------- | --------------------------------------------- |
|  insert(int)     | O(log n) avg / O(n) worst | O(log n) avg / O(n) worst *(recursive stack)* |
|  contains(int)   | O(log n) avg / O(n) worst | O(log n) avg / O(n) worst *(recursive stack)* |
|  getHeight()     | O(n)                      | O(n) *(recursive stack)*                      |
|  getNodeCount()  | O(1)                      | O(1)                                          |
|  isEmpty()       | O(1)                      | O(1)                                          |
|  clearTree()     | O(1)                      | O(1)                                          |

## Graph

| **Method**                 | **Time Complexity**             | **Space Complexity**              |
| -------------------------- | ------------------------------- | --------------------------------- |
|  insertEdge(int u, int v)  | O(1) avg *(amortized per edge)* | O(1) per edge + O(1) per new node |
|  search(int)               | O(1)                            | O(1)                              |
|  getNodesCount()           | O(1)                            | O(1)                              |
|  isEmpty()                 | O(1)                            | O(1)                              |
|  clear()                   | O(n + e)                        | O(1) *(references dropped)*       |
|  printGraph()              | O(n + e)                        | O(1)                              |

## Hash Table

| **Method**            | **Time Complexity**   | **Space Complexity** |
| --------------------- | --------------------- | -------------------- |
| `insertItem(int key)` | O(1) avg / O(n) worst | O(1)                 |
| `deleteItem(int key)` | O(1) avg / O(n) worst | O(1)                 |
| `displayHash()`       | O(n + b)              | O(1)                 |

## Min Heap

| **Method**    | **Time Complexity** | **Space Complexity** |
| ------------- | ------------------- | -------------------- |
|  insert(int)  | O(log n)            | O(1)                 |
|  deleteMin()  | O(log n)            | O(1)                 |
|  getMin()     | O(1)                | O(1)                 |
|  display()    | O(n)                | O(1)                 |
|  isEmpty()    | O(1)                | O(1)                 |

## Graph (BStT and DFS)

| **Method**                | **Time Complexity** | **Space Complexity** |
| ------------------------- | ------------------- | -------------------- |
| `addVertex(String)`       | O(1)                | O(1)                 |
| `addEdge(String, String)` | O(1)                | O(1)                 |
| `display()`               | O(V + E)            | O(1)                 |
| `bfs(String)`             | O(V + E)            | O(V)                 |
| `dfs(String)`             | O(V + E)            | O(V)                 |

## Tree Traversal Algorithm 

| Method                | Time Complexity | Space Complexity            |
| --------------------- | --------------- | --------------------------- |
| insrtNode(int)        | O(n)            | O(n) (queue size in worst)  |
| contains(int)         | O(n)            | O(n)                        |
| getHeight()           | O(n)            | O(h) (recursive call stack) |
| getNodeCount()        | O(1)            | O(1)                        |
| inorderTraversal()    | O(n)            | O(n)                        |
| preorderTraversal()   | O(n)            | O(n)                        |
| postorderTraversal()  | O(n)            | O(n)                        |
| levelOrderTraversal() | O(n)            | O(n)                        |
| isEmpty()             | O(1)            | O(1)                        |
| clear()               | O(1)            | O(1)                        |

## Trie
| Method                   | Time Complexity                      | Space Complexity           |
| ------------------------ | ------------------------------------ | -------------------------- |
| addWord(String)          | O(m) — *m* is the length of the word | O(m) for new nodes created |                                                                                                   
| findWord(String)         | O(m)                                 | O(1)                       |                                                                                                     
| startsWithPrefix(String) | O(m)                                 | O(1)                       |                                                                                                    


## Union Find

| Method                | Time Complexity                                                 | Space Complexity        |
| --------------------- | --------------------------------------------------------------- | ----------------------- |
|   find(int i)         | Amortized O(α(n)) (inverse Ackermann function, nearly constant) | O(n)                    |
|   unite(int i, int j) | Amortized O(α(n))                                               | O(n)                    |





### Usage Examples

## Singly Linked List:
Real-time chat message buffering.

## Doubly Linked List:
Browser history navigation (forward/back).

## Circular Linked List:
Multiplayer game turns rotation.

## Stack:
Expression evaluation (calculators, compilers).

## Queue: 
Print job scheduling.

## Binary Tree: 
Decision trees in AI.

## Binary Search Tree:
Efficient database indexing.

## Tree Traversals:
XML/JSON data processing.

## Hash Table:
Caching results in web servers.

## Min Heap: 
Event driven simulation scheduling.

## Graph:
Route planning in GPS/navigation apps.

## Union Find (Disjoint Set): 
Network connectivity detection 

## Trie: 
Spell checkers and IP routing tables.

## How to Run Tests

1. Clone the repository:
https://github.com/Batool02/data-structure-week-implementation
