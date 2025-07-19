# data-structure-week-implementation

## Overview
This repository has simple and clean implementations of important data structures. Each one helps solve common problems in programming, and you’ll find explanations, how they work, and where they are useful.
## Data Structures Included

### Dynamic Array
An array that automatically grows when it runs out of space.
### Singly Linked List
A list where each item points to the next one. It moves in one direction.

### Stack (Array & Linked List Implementation)
A structure where you add/remove from the top only (Last In, First Out).

### Doubly Linked List
Each item points to both the next and the previous item.

### Circular Linked List
The last item connects back to the first, forming a loop.

### Queue
Items are added to the back and removed from the front (First In, First Out).

### Binary Tree
Each item (node) connects to up to two children. It's the base of many other trees.

### Binary Search Tree (BST)
A type of binary tree that keeps items in sorted order for fast searching.

### Tree Traversal Algorithms
Ways to visit each node in a tree:

Inorder: Left → Root → Right

Preorder: Root → Left → Right

Postorder: Left → Right → Root

Level-order: Visit nodes level by level

### Hash Table
Stores data using a key and a hash function to find it fast. Handles collisions using chains (lists).

### Min Heap
A tree stored as an array where the smallest number is always at the top.

### Graph (Adjacency List)
A way to show connections between items (nodes). Each item keeps a list of what it’s connected to.

### Union-Find (Disjoint Set)
A structure that keeps track of connected groups. You can find which group something is in and merge groups.

### Trie 
A tree for storing words letter by letter. Great for fast word searches and suggestions.
Use for: autocomplete, spelling correction, IP routing.
## Time and Space Complexity Summary

### Dynamic Array
| Method      | Time Complexity             | Space Complexity |
| ----------- | --------------------------- | ---------------- |
|  add()      | O(1) amortized / O(n) worst | O(1)             |
|  get()      | O(1)                        | O(1)             |
|  remove()   | O(1)                        | O(1)             |
|  size()     | O(1)                        | O(1)             |
|  isEmpty()  | O(1)                        | O(1)             |
|  print()    | O(n)                        | O(1)             |
|  resize()   | O(n)                        | O(n)             |





### Stack
| Method        | Time Complexity | Space Complexity |
| ------------- | --------------- | ---------------- |
|  push()       | O(1)            | O(1)             |
|  pop()        | O(1)            | O(1)             |
|  peek()       | O(1)            | O(1)             |
|  show()       | O(n)            | O(1)             |
|  constructor  | O(1)            | O(n)             |


### Queue Array
| Method           | Time Complexity             | Space Complexity |
| ---------------- | --------------------------- | ---------------- |
|  push()          | O(1) amortized / O(n) worst | O(1)             |
|  pop()           | O(n)                        | O(1)             |
|  peekHead()      | O(1)                        | O(1)             |
|  includes()      | O(n)                        | O(1)             |
|  removeValue()   | O(n)                        | O(1)             |
|  isEmpty()       | O(1)                        | O(1)             |
|  length()        | O(1)                        | O(1)             |
|  displayQueue()  | O(n)                        | O(1)             |
|  grow()          | O(n)                        | O(n)             |


### Linked List

| Method                | Time Complexity | Space Complexity |
| --------------------- | --------------- | ---------------- |
|  getSize()            | O(1)            | O(1)             |
|  insertAtEnd()        | O(n)            | O(1)             |
|  insertAtBeginning()  | O(1)            | O(1)             |
|  deleteAt(position)   | O(n)            | O(1)             |
|  findIndex(value)     | O(n)            | O(1)             |
|  getValue(position)   | O(n)            | O(1)             |
|  display()            | O(n)            | O(1)             |

### Queue Linked List
| Method           | Time Complexity | Space Complexity |
| ---------------- | --------------- | ---------------- |
|  push()          | O(1)            | O(1)             |
|  pop()           | O(1)            | O(1)             |
|  peekHead()      | O(1)            | O(1)             |
|  includes()      | O(n)            | O(1)             |
|  removeValue()   | O(n)            | O(1)             |
|  isEmpty()       | O(1)            | O(1)             |
|  length()        | O(1)            | O(1)             |
|  displayQueue()  | O(n)            | O(1)             |


### Circular List

| **Method**          | **Time Complexity** | **Space Complexity** |
| ------------------- | ------------------- | -------------------- |
|  insertStart(int)   | O(1)                | O(1)                 |
|  insertEnd(int)     | O(1)                | O(1)                 |
|  locateIndex(int)   | O(n)                | O(1)                 |
|  showAll()          | O(n)                | O(1)                 |
|  totalNodesCount()  | O(1)                | O(1)                 |


###  Doubly List

| **Method**           | **Time Complexity** | **Space Complexity** |
| -------------------- | ------------------- | -------------------- |
|  insertAtFront(int)  | O(1)                | O(1)                 |
|  insertLast(int)     | O(1)                | O(1)                 |
|  printList()         | O(n)                | O(1)                 |
|  countItems()        | O(1)                | O(1)                 |
|  findPosition(int)   | O(n)                | O(1)                 |

### Binary Tree
| Method                     | Time Complexity | Space Complexity |
| -------------------------- | --------------- | ---------------- |
|  insert(int value)         | O(n)            | O(n)             |
|  search(int value)         | O(n)            | O(n)             |
|  getHeight()               | O(n)            | O(h)             |
|  getHeightRecursive(Node)  | O(n)            | O(h)             |
|  getNodeCount()            | O(1)            | O(1)             |

### Binary Search Tree

| **Method**       | **Time Complexity**       | **Space Complexity**                          |
| ---------------- | ------------------------- | --------------------------------------------- |
|  insert(int)     | O(log n) avg / O(n) worst | O(log n) avg / O(n) worst *(recursive stack)* |
|  contains(int)   | O(log n) avg / O(n) worst | O(log n) avg / O(n) worst *(recursive stack)* |
|  getHeight()     | O(n)                      | O(n) *(recursive stack)*                      |
|  getNodeCount()  | O(1)                      | O(1)                                          |
|  isEmpty()       | O(1)                      | O(1)                                          |
|  clearTree()     | O(1)                      | O(1)                                          |




### Graph

| **Method**                 | **Time Complexity**             | **Space Complexity**              |
| -------------------------- | ------------------------------- |-----------------------------------|
|  insertEdge(int u, int v)  | O(1) avg *(amortized per edge)* | O(1) per edge + O(1) per new node |
|  search(int)               | O(1)                            | O(1)                              |
|  getNodesCount()           | O(1)                            | O(1)                              |
|  isEmpty()                 | O(1)                            | O(1)                              |
|  clear()                   | O(n + e)                        | O(1)                              |
|  printGraph()              | O(n + e)                        | O(1)                              |


### Hash Table

| **Method**            | **Time Complexity**   | **Space Complexity** |
| --------------------- | --------------------- | -------------------- |
|  insertItem(int key)  | O(1) avg / O(n) worst | O(1) per key         |
|  deleteItem(int key)  | O(1) avg / O(n) worst | O(1)                 |
|  displayHash()        | O(n + b)              | O(1)                 |


### Min Heap

| **Method**    | **Time Complexity** | **Space Complexity** |
| ------------- | ------------------- | -------------------- |
|  insert(int)  | O(log n)            | O(1)                 |
|  deleteMin()  | O(log n)            | O(1)                 |
|  getMin()     | O(1)                | O(1)                 |
|  display()    | O(n)                | O(1)                 |
|  isEmpty()    | O(1)                | O(1)                 |


### Graph BST DFS

| **Method**                | **Time Complexity** | **Space Complexity** |
| ------------------------- | ------------------- | -------------------- |
|  addVertex(String)        | O(1)                | O(1)                 |
|  addEdge(String, String)  | O(1)                | O(1)                 |
|  display()                | O(V + E)            | O(1)                 |
|  bfs(String)              | O(V + E)            | O(V)                 |
|  dfs(String)              | O(V + E)            | O(V)                 |


### Tree Traversal Algorithm

| Method                  | Time Complexity | Space Complexity            |
| ----------------------- | --------------- | --------------------------- |
|  insrtNode(int)         | O(n)            | O(n) (queue size in worst)  |
|  contains(int)          | O(n)            | O(n)                        |
|  getHeight()            | O(n)            | O(h) (recursive call stack) |
|  getNodeCount()         | O(1)            | O(1)                        |
|  inorderTraversal()     | O(n)            | O(n)                        |
|  preorderTraversal()    | O(n)            | O(n)                        |
|  postorderTraversal()   | O(n)            | O(n)                        |
|  levelOrderTraversal()  | O(n)            | O(n)                        |
|  isEmpty()              | O(1)            | O(1)                        |
|  clear()                | O(1)            | O(1)                        |




### Trie

| Method                   | Time Complexity                      | Space Complexity                                                                                                                |
|--------------------------| ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------- |
| addWord(String)          | O(m) — *m* is the length of the word | O(m) for new nodes created                                                                                                      |
| findWord(String)         | O(m)                                 | O(1)                                                                                                                            |
| startsWithPrefix(String) | O(m)                                 | O(1)                                                                                                                            |
| suggestWords(String)     | O(p + k \* l)                        | O(k \* l) where: <br> *p* = prefix length <br> *k* = number of suggested words <br> *l* = average length of each suggested word |


### UnionFind
| Method             | Time Complexity                                                 | Space Complexity        |
| ------------------ | --------------------------------------------------------------- | ----------------------- |
| find(int i)        | Amortized O(α(n)) (inverse Ackermann function, nearly constant) | O(n) (for parent array) |
| unite(int i, int j)| Amortized O(α(n))                                               | O(n) (for rank array)   |


# Usage Examples

### Singly Linked List:
Real-time chat message buffering.

### Doubly Linked List:
Browser history navigation (forward/back).

### Circular Linked List:
Multiplayer game turns rotation.

### Stack:
Expression evaluation (calculators, compilers).

### Queue: 
Print job scheduling.

### Binary Tree: 
Decision trees in AI.

### Binary Search Tree:
Efficient database indexing.

### Tree Traversals:
XML/JSON data processing.

### Hash Table:
Caching results in web servers.

### Min Heap:
Event-driven simulation scheduling.

### Graph:
Route planning in GPS/navigation apps.

### Trie:
Spell checkers and IP routing tables.

### Union Find :
Network connectivity detection 



## How to Run Tests

1. Clone the repository:
https://github.com/Batool02/data-structure-week-implementation
2. Run the code
