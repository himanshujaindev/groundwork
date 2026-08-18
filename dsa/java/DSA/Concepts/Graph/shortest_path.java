package Algorithms.Graph;

import java.util.LinkedList;
import java.util.Queue;

// Input = Maze / Array
// BFS = Shortest Path

public class shortest_path {

    static class Pair {
        int first, second;

        Pair(int a, int b) {
            this.first = a;
            this.second = b;
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };

        int n = graph.length;
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        Queue<Pair> queue = new LinkedList<>();
        boolean[][] visit = new boolean[n][n];
        int ones = 0;

        queue.offer(new Pair(0, 0));
        visit[0][0] = true;
        System.out.print("START -> (0,0) -> ");
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pair cur = queue.poll();
                // base case
                if (cur.first == n - 1 && cur.second == n - 1) {
                    System.out.println("END");
                    System.out.println("Count = " + ones);
                    return;
                }

                for (int[] d : dir) {
                    int row = cur.first + d[0];
                    int col = cur.second + d[1];

                    if (row < 0 || row >= n || col < 0 || col >= n) {
                        continue;
                    }

                    if (!visit[row][col] && graph[row][col] == 1) {
                        queue.add(new Pair(row, col));
                        visit[row][col] = true;
                    }
                }
            }
            ones++;
            System.out.print("(" + queue.peek().first + "," + queue.peek().second + ") -> ");
        }
    }
}
