package DataStructures.Implementation.Graph;

import java.util.Stack;

import Common.graph_io;

// DFS = Stack

public class dfs_iterative {

    static private void dfs(int[][] graph, int start) {

        int n = graph.length;
        boolean[] visit = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visit[start] = true;

        System.out.print("START -> ");
        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(node + " -> ");
            for (int j = 0; j < n; j++) {
                if (j == node || graph[node][j] == 0 || visit[j])
                    continue;

                stack.push(j);
                visit[j] = true;
            }
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        int n = 5;
        int start = 0;
        int[][] edges = { { 0, 1 }, { 0, 4 }, { 1, 4 }, { 1, 3 }, { 4, 3 }, { 1, 2 }, { 3, 2 } };
        int[][] adj_matrix = graph_io.readAdjMatrix_Undirected(n, edges.length, edges);

        System.out.println("Input Graph:");
        graph_io.displayAdjMatrix(adj_matrix);

        dfs(adj_matrix, start);

    }
}
