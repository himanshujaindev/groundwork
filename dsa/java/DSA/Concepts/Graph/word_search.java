package Algorithms.Graph;

class Solution {
    int[][] dirs = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };

    boolean dfs(char[][] board, String word, boolean[][] visit, int row, int col, int pos) {
        if (pos == word.length())
            return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || visit[row][col] || board[row][col] != word.charAt(pos))
            return false;

        visit[row][col] = true;
        for (int[] d : dirs)
            if (dfs(board, word, visit, row + d[0], col + d[1], pos + 1))
                return true;
        visit[row][col] = false;
        /*
        Once you go in all dirs and cur char in not a part of the word, 
        unvisit that, so that next time cur char can be again considered
        */

        return false;
    }

    public boolean exist(char[][] board, String word) {

        boolean[][] visit = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (dfs(board, word, visit, i, j, 0))
                    return true;

        return false;
    }
}

public class word_search {
    public static void main(String[] args) {
        Solution sc = new Solution();

        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        System.out.println(sc.exist(board, word));
    }
}
