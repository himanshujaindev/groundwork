package Algorithms.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Topology Sort
1. Applicable only on DAG
2. Linear ordering of vertices such that
    for every edge u -> v
        u appears before v in the ordering
*/

/*
Kahn's Algo: Uses BFS
1. Find indegree of all the nodes
2. queue -> add nodes with 0 indegree
3. run BFS -> add node's neighbour with 0 indegree to queue
*/
class Solution {
    List<List<Integer>> contructGrpah(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            int src = edge[0] - 1;
            int dst = edge[1] - 1;

            graph.get(src).add(dst);
        }

        return graph;
    }

    List<Integer> topologyKahn(List<List<Integer>> graph) {
        // Find indegree = Iterate thro the values of adj list
        int n = graph.size();
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int node : graph.get(i)) {
                indegree[node]++;
            }
        }

        // Add 0 indegree to queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // bfs
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node + 1); // plus 1 because node are numbered from 1..n

            for (int neighbour : graph.get(node)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0)
                    queue.add(neighbour);
            }
        }

        return ans;
    }
}

public class topology_sort_bfs {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int n = 5;
        int[][] edges = { { 1, 2 }, { 1, 3 }, { 2, 5 }, { 3, 5 }, { 5, 4 } };

        List<List<Integer>> graph = sc.contructGrpah(n, edges);
        System.out.println(sc.topologyKahn(graph).toString());
    }
}
