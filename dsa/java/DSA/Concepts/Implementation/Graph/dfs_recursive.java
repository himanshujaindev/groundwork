package DataStructures.Implementation.Graph;

import Common.graph_io;

// DFS = Stack

public class dfs_recursive {

    static private void dfs(int[][] graph, int cur, boolean[] visit) {

        System.out.print(cur + " -> ");

        visit[cur] = true;

        for (int i = 0; i < graph.length; i++)
            if (!visit[i] && graph[cur][i] == 1)
                dfs(graph, i, visit);
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int[][] edges = { { 0, 1 }, { 0, 4 }, { 1, 4 }, { 1, 3 }, { 4, 3 }, { 1, 2 }, { 3, 2 } };
        int[][] adj_matrix = graph_io.readAdjMatrix_Undirected(n, edges.length, edges);

        System.out.println("Input Graph:");
        graph_io.displayAdjMatrix(adj_matrix);

        boolean[] visit = new boolean[n];

        System.out.print("START -> ");
        dfs(adj_matrix, start, visit);
        System.out.println("END");
    }
}