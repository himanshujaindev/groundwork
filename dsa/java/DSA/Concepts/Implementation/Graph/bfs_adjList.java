package DataStructures.Implementation.Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import Common.graph_io;

/*
BFS = Queue
BFS recursive not possible (only iterative)
*/

public class bfs_adjList {

    private static void bfs(ArrayList<ArrayList<Integer>> adj, int start) {
        Queue<Integer> queue = new LinkedList<>();
        int V = adj.size();

        queue.add(start);

        int[] visit = new int[V];

        System.out.print("START -> ");
        while (queue.size() != 0) {
            int element = queue.poll();
            visit[element] = 1;
            System.out.print(element + " -> ");
            Iterator<Integer> it = adj.get(element).iterator();

            while (it.hasNext()) {
                int next = it.next();
                if (visit[next] == 0) {
                    queue.add(next);
                    visit[next] = 1;
                }
            }
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        // Adj List
        int n = 5;
        int start = 0;
        int[][] edges = { { 0, 1 }, { 0, 4 }, { 1, 4 }, { 1, 3 }, { 4, 3 }, { 1, 2 }, { 3, 2 } };
        ArrayList<ArrayList<Integer>> adj_list = graph_io.readAdjList_Undirected(n, edges.length, edges);

        System.out.println("Input Graph:");
        graph_io.displayAdjList(adj_list);

        bfs(adj_list, start);
    }
}
