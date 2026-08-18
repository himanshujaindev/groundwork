package Algorithms.Graph;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> contructGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            int src = edge[0] - 1;
            int dst = edge[1] - 1;

            graph.get(src).add(dst);
            graph.get(dst).add(src);
        }

        return graph;
    }

    boolean dfs(List<List<Integer>> graph, boolean[] visit, int parent, int current) {
        visit[current] = true;

        for (int next : graph.get(current)) {
            if (!visit[next]) {
                if (dfs(graph, visit, current, next))
                    return true;
            }

            else if (parent != next)
                return true;
        }
        return false;
    }

    /*
    Use DFS from every unvisited node. Depth First Traversal can be used to 
    detect a cycle in a Graph. There is a cycle in a graph only if there is 
    a back edge present in the graph. A back edge is an edge that is indirectly 
    joining a node to itself (self-loop) or one of its ancestors in the tree produced by DFS.
    
    To find the back edge to any of its ancestors keep a visited array and if 
    there is a back edge to any visited node then there is a loop and return true.
    */

    boolean isCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i] && dfs(graph, visit, -1, i))
                return true;
        }

        return false;
    }
}

public class detect_cycle_unidirected {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int n = 5;
        int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 1, 5 } };
        // int[][] edges = { { 1, 2 }, { 1, 3 }, { 2, 4 } };

        List<List<Integer>> graph = sc.contructGraph(n, edges);
        System.out.println(sc.isCyclic(graph));
    }
}
