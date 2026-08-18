package Algorithms.Graph;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    private int dfs(int[][] grid, List<String> path, int row, int col, int zeros) {
        int m = grid.length, n = grid[0].length, totalPaths = 0;

        if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == -1)
            return 0;

        if (grid[row][col] == 2) {
            if (zeros == -1) {
                path.add("(" + row + " " + col + ")");
                System.out.println(new ArrayList<>(path).toString());
                path.remove(path.size() - 1);

                return 1;
            }
            return 0;
        }

        grid[row][col] = -1;
        zeros--;
        path.add("(" + row + " " + col + ")");

        for (int[] dir : dirs) {
            int r = dir[0] + row;
            int c = dir[1] + col;
            totalPaths += dfs(grid, path, r, c, zeros);
        }

        grid[row][col] = 0;
        zeros++;
        path.remove(path.size() - 1);

        return totalPaths;
    }

    public int uniquePathsIII(int[][] grid) {

        int m = grid.length, n = grid[0].length, startRow = 0, startCol = 0, zeros = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    zeros++;

                else if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        return dfs(grid, new ArrayList<>(), startRow, startCol, zeros);
    }
}

public class unique_path_grid {
    public static void main(String[] args) {
        Solution sc = new Solution();
        // int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
        int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 2 } };
        System.out.println(sc.uniquePathsIII(grid));
    }
}
