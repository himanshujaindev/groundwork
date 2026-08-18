package Algorithms.Graph;

import java.util.ArrayList;
import java.util.List;

// dfs + backtracking
class Solution {

    void dfs(int[][] graph, boolean[] visit, List<List<Integer>> paths, int source, List<Integer> path) {
        int destination = graph.length - 1;

        visit[source] = true;
        path.add(source);

        if (source == destination)
            paths.add(new ArrayList<>(path));

        for (int nextNode : graph[source])
            if (!visit[nextNode])
                dfs(graph, visit, paths, nextNode, path);

        visit[source] = false;
        path.remove(path.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        boolean[] visit = new boolean[graph.length];

        dfs(graph, visit, paths, 0, new ArrayList<>());
        return paths;
    }
}

public class dac_paths {
    public static void main(String[] args) {
        Solution sc = new Solution();
        /* 
        graph[i] is a list of all nodes you can visit from node i
        (i.e., there is a directed edge from node i to node graph[i][j])
        */

        // int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
        int[][] graph = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };

        System.out.println(sc.allPathsSourceTarget(graph));
    }
}
