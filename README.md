# COMP587-HW2
### Requirements
- Implement the methods for `class TreeOperations` in TreeOperations.java while using `class Node` in Node.java as the class definition of the vertices in the tree being evaluated by:
  - [x] `public static <A> ArrayList<A> bfs(final Node<A> root)`
  - [x] `public static <A> ArrayList<A> preorder(final Node<A> root)`
  - [x] `public static <A> int maxDepth(final Node<A> root)`
- Write unit tests for the methods implemented in `class TreeOperations` in TreeOperationsTest.java
  - Measure code coverage of the test using Maven.
    - [x] Achieve a minimum of 90% code coverage from the report.
    - If you are unable to achieve 90% code coverage through additional tests, explain why it cannot be improved.
  - Run mutation analysis against your unit tests using Maven.
    - Achieve a minimum of 90% kill rate on mutations.
    - If you are unable to achieve 90% kill rate, explain why it cannot be improved. 
 ### Tree in unit tests
 ```
     F 
    / \
   B   G
  /\    \
 A  D    I
    /\  / \
   C E  H  J
            \
             K

 ```
