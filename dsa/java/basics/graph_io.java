package Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DataStructures.Collection.Stack.stack;

public class graph_io {

    /* 
    Adjacency matrix:
        rows & cols = num of vertices (n)
        value in matrix = edge
     */
    // edges = {{from_node, to_node}... #no_edges}
    public static int[][] readAdjMatrix_Undirected(int vertices, int no_edges, int[][] edges) {
        int n = vertices;
        int[][] adj_matrix = new int[n][n];

        for (int i = 0; i < no_edges; i++) {
            int source = edges[i][0];
            int dest = edges[i][1];
            adj_matrix[source][dest] = 1;
            adj_matrix[dest][source] = 1; // Undirected graph
        }

        return adj_matrix;
    }

    public static void displayAdjMatrix(int[][] graph) {
        io.displayMatrix(graph);
    }

    /* 
    Adjacency List: Array of List
        Array = Num of Vertices (n)
    
     */
    // edges = {{from_node, to_node}... #no_edges}
    public static ArrayList<ArrayList<Integer>> readAdjList_Undirected(int vertices, int no_edges, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>(vertices);

        for (int i = 0; i < vertices; i++) {
            adj_list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < no_edges; i++) {
            int source = edges[i][0];
            int dest = edges[i][1];

            adj_list.get(source).add(dest);
            adj_list.get(dest).add(source); // Undirected Graph
        }

        return adj_list;
    }

    public static void displayAdjList(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " -> ");
            }
            System.out.println("END");
        }
    }

}
