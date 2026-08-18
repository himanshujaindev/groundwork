package DataStructures.Implementation.Graph;

import java.util.LinkedList;
import java.util.Queue;

import Common.graph_io;

/*
BFS = Queue
BFS recursive not possible (only iterative)
*/

public class bfs_adjMatrix {

    private static void bfs(int[][] graph, int start) {

        int vertices = graph.length;
        boolean[] visit = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visit[start] = true;
        queue.offer(start);

        System.out.print("START -> ");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                System.out.print(node + " -> ");
                for (int j = 0; j < vertices; j++) {
                    if (j == node || graph[node][j] == 0 || visit[j]) {
                        continue;
                    }
                    queue.offer(j);
                    visit[j] = true;
                }
            }
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        // Adj Matrix
        int n = 5;
        int start = 0;
        int[][] edges = { { 0, 1 }, { 0, 4 }, { 1, 4 }, { 1, 3 }, { 4, 3 }, { 1, 2 }, { 3, 2 } };
        int[][] adj_matrix = graph_io.readAdjMatrix_Undirected(n, edges.length, edges);

        System.out.println("Input Graph:");
        graph_io.displayAdjMatrix(adj_matrix);

        bfs(adj_matrix, start);

    }
}
