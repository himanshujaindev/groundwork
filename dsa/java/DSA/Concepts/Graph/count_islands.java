package Algorithms.Graph;

import java.util.Stack;

// Input = Maze / Array
// Count the no of Islands
// Backtracking

public class count_islands {

    static class Pair {
        int first, second;

        Pair(int a, int b) {
            this.first = a;
            this.second = b;
        }
    }

    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    static private void dfsRecursive(int[][] graph, int n, boolean[][] visit, Pair node) {

        int row = node.first;
        int col = node.second;

        if (row < 0 || row >= n || col < 0 || col >= n || visit[row][col] || graph[row][col] == 0)
            return;

        visit[row][col] = true;
        System.out.print("(" + row + "," + col + ") -> ");

        for (int[] d : dir) {
            dfsRecursive(graph, n, visit, new Pair(row + d[0], col + d[1]));
        }
    }

    static private void dfsIterative(int[][] graph, int n, boolean[][] visit, Pair cur) {

        Stack<Pair> stack = new Stack<>();

        stack.push(cur);
        visit[cur.first][cur.second] = true;
        System.out.print("(" + cur.first + "," + cur.second + ") -> ");

        while (!stack.isEmpty()) {
            Pair node = stack.pop();
            for (int[] d : dir) {
                int row = node.first + d[0];
                int col = node.second + d[1];

                if (row < 0 || row >= n || col < 0 || col >= n || visit[row][col] || graph[row][col] == 0)
                    continue;

                stack.push(new Pair(row, col));
                visit[row][col] = true;
                System.out.print("(" + row + "," + col + ") -> ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] {
                { 1, 0, 1 },
                { 1, 0, 1 },
                { 1, 0, 1 }
        };
        int n = graph.length;
        boolean[][] visit = new boolean[n][n];

        // Count Island Problem
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && graph[i][j] == 1) {
                    dfsRecursive(graph, n, visit, new Pair(i, j));
                    // dfsIterative(graph, n, visit, new Pair(i, j));
                    System.out.println("END");
                }
            }
        }
    }
}
