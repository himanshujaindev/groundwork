
class Solution {

    /*
    https://neetcode.io/problems/valid-tree
    https://www.geeksforgeeks.org/check-given-graph-tree/

    graph is a tree if:
    - no cycle
    - graph is connected
    OR
    - connected
    - (n-1) edges; n = number of nodes
     */
    public boolean validTree(int n, int[][] edges) {
        return false;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    }
}
