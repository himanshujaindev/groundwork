
class Solution {

    private void dfs(int r, int c, boolean[][] visit, char[][] grid) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || visit[r][c] || grid[r][c] == '0') {
            return;
        }

        visit[r][c] = true;

        int[] rows = new int[]{0, -1, 0, 1};
        int[] cols = new int[]{-1, 0, 1, 0};
        for (int i = 0; i < 4; i++) {
            dfs(r + rows[i], c + cols[i], visit, grid);
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0, m = grid.length, n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(i, j, visit, grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}}));
    }
}
