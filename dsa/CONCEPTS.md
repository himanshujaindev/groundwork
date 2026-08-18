arrays
- Hashing
- Hashset
- Two pointers
- prefix and sufix
- Kadane's Algorithm
- sorted - binary search

---

dp
Recursion -> Memoization -> Tabulation -> Space Optimization

Two properties of dp problem:
Optimal Substructure -> Problem can be expressed in terms of Recursion
Overlapping Subproblems -> Many subproblems that are computed multiple times

Memoization (recursion) = Top-down = main problem -> base case

Steps:
1. create dp[n+1] array initialized to -1
2. if(dp[n] != -1) -> return dp[n] // value is already computed
3. else -> use recursive relation to compute dp[n] -> at the end, store the result


Tabulation = Bottom-up = base case -> main problem

Steps:
1. declare dp[n+1] array
2. initialize the base case -> dp[0] and/or dp[1]
3. traverse array -> every index -> dp[i] = dp[i-1] + dp[i-2]


Space Optimization

Steps:
1. If additional space is not required, use variables
    dp[i-1] -> prev1
    dp[i-2] -> prev2


---


sorting
1. selection sort - find min and swap
2. bubble sort - swap locally by moving largest element to the end
3. quick sort - pivot (partition) -> 1st element; i -> more than pivot; j -> less than pivot; swap
4. Merge sort - merge two sorted array
5. insertion sort - 1st element is sorted; every time 1 element is inserted into sorted arr
6. heap sort - 
7. selection sort

---

search
1. linear search
2. binary search - low, mid, high

---

Linked List:
- Use pointers
- Use dummy nodes

---

graph:
1. dfs - stack
2. bfs - queue (Shortest Path)
3. directed acyclic graph (DAG) -
    topological sorting - dfs -> reverse pop

adjacent matrix
adjacent list - for every vertex - all edges


shortest path in graph
single source shortest path

---

tree: Solve by recursion
1. binary tree (1 parent - 2 child)
    hieght: max(height(left), height(right)) + 1
            count number of edges
            node to leaf
    depth = level = node to root

BT -> Heap
BST -> AVL -> BTT -> 2-3 tree (B Tree)

AVL
- Balanced BST
- Balancing Factor (BF) = Height of Left Subtree - Height of Right Subtree
- AVL is balanced if BF = 0, 1 or -1



Insertion of node
Deletion of node


Spanning Tree - Convert Graph -> Tree

Preoder - root, left, right
Inorder - left, root, right
Postorder - left, right, root











Travelling Salesman Problem (TSP)
Knapsack Problem
Job Assignment Problem
Divide and Conquer
Decrease and Conquer - divide into two; discard one piece
Fake Coin Problem

heap - find kth smallest elem
- tree (complete BT)
- parental domination
p -> left child = 2p+1; right child = 2p+2
last parent -> (n/2)-1 ; n = # nodes
min heap; max heap

--------


Floyd Warshall Algo
- All pair shortest path
- Generate shortestPathMatrix
- Intermediate node - k
```
For k = 0 to n – 1 
    For i = 0 to n – 1 
        For j = 0 to n – 1 
            Distance[i, j] = min(Distance[i, j], Distance[i, k] + Distance[k, j])
where i = source Node, j = Destination Node, k = Intermediate Node
```


---- BD

Dijkstra's Algo
- Single source shortest path
- Unweighted graph
- Greedy method
- Create shortest path tree (SPT) with given source as root
- maintain 2 set
    one set contains vertices included in SPT
    another set contains vertices not included in SPT
- {0 INF INF INF INF INF} -> update this with weight
- {0 ... } -> SPT


Bellman Ford
- Single source shortest path
- Weight graph / Detect Negative edges
- distance array and edges list
- A -> B = 3 ; d(A) + 3 = d(B)
- Iterate thro all the edges (v-1) times
- if relaxation for vth time is possible then negative weight cycle is detected

-----

Minimum Spanning Tree (PK)
- Prim's Algo
1. pick any start vertex
2. identify fringe vertex (vertex connected to the cur vertex)
3. pick the smallest edge
4. add to the tree if it does not form cycle


- Kruskal's Algo
1. sort the edges
2. pick smallest edge
   if no cycle, then add the edge
3. (v-1) edges


1. Count Number of Islands
2. Word Search - Backtracking
3. All the paths from source to destination = dfs + backtracking




https://www.aboutamazon.in/about-us/leadership-principles
