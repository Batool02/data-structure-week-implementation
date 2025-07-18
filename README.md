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
Stores key-value pairs using hashing with collision handling via chaining.

### Min Heap
Complete binary tree stored as an array, ensuring the smallest value is always on top.

### Basic Graph (Adjacency List)
Represents vertices and their edges using adjacency lists, modeling connections like social networks.

## Time and Space Complexity Summary

| Data Structure          | Method             | Time Complexity      | Space Complexity |
|------------------------|--------------------|----------------------|------------------|
| Dynamic Array          | add(), get(), set() | O(1) avg / O(n) worst| O(n)             |
| Singly Linked List     | search(), addFirst()| O(n), O(1)           | O(n)             |
| Stack (Array & Linked) | push(), pop(), peek()| O(1)                | O(n)             |
| Doubly Linked List     | addFirst(), search()| O(1), O(n)           | O(n)             |
| Circular Linked List   | addFirst(), search()| O(1), O(n)           | O(n)             |
| Queue                  | enqueue(), dequeue()| O(1)                 | O(n)             |
| Binary Search Tree     | addValue(), search()| O(h)                 | O(h)             |
| Tree Traversals        | inorder, preorder   | O(n)                 | O(h)             |
| Hash Table             | addValue(), search()| O(1) avg / O(n) worst| O(n)             |
| Min Heap               | addValue(), search()| O(log n), O(n)       | O(n)             |
| Graph (Adjacency List) | addValue(), search()| O(1), O(V+E)         | O(V + E)         |

*Where:*  
- *n* = number of elements/nodes  
- *h* = height of the tree  
- *V* = number of vertices  
- *E* = number of edges  

## Usage Examples

- **Dynamic Array:** Shopping cart where items can be added/removed dynamically.  
- **Singly Linked List:** Streaming music playlists.  
- **Doubly Linked List:** Undo/redo functionality in editors.  
- **Circular Linked List:** Media players buffering in loops.  
- **Stack:** UI navigation in games.  
- **Queue:** Message processing systems.  
- **Binary Tree:** File system organization.  
- **Binary Search Tree:** Autocomplete in search bars.  
- **Tree Traversals:** Generating sorted contact lists or evaluating expressions.  
- **Hash Table:** Fast user profile lookup in social apps.  
- **Min Heap:** Task prioritization in to-do apps.  
- **Graph:** Social network modeling.

## How to Run Tests

1. Clone the repository:
https://github.com/Batool02/data-structure-week-implementation
