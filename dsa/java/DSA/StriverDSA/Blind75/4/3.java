
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    private void dfs(int row, int col, boolean[][] visit, int prevHeight, int[][] heights) {
        if (row < 0 || row >= heights.length || col < 0 || col >= heights[0].length || visit[row][col] == true || heights[row][col] < prevHeight) {
            return;
        }

        visit[row][col] = true;

        int[] rows = new int[]{0, -1, 0, 1};
        int[] cols = new int[]{-1, 0, 1, 0};

        for (int i = 0; i < 4; i++) {
            int newRow = row + rows[i];
            int newCol = col + cols[i];
            dfs(newRow, newCol, visit, heights[row][col], heights);
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int r = 0; r < m; r++) {
            dfs(r, 0, pacific, heights[r][0], heights);
            dfs(r, n - 1, atlantic, heights[r][n - 1], heights);
        }

        for (int c = 0; c < n; c++) {
            dfs(0, c, pacific, heights[0][c], heights);
            dfs(m - 1, c, atlantic, heights[m - 1][c], heights);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        List<List<Integer>> res = sc.pacificAtlantic(new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}});
        for (List<Integer> r : res) {
            System.out.println(r.toString());
        }

    }
}
