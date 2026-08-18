
import java.util.ArrayList;

class Solution {

    /*
    DFS; Adj List
    T: o(numCourses+prerequisites)
    S: o(numCourses+prerequisites)
     */
    private boolean dfs(int crs, ArrayList<ArrayList<Integer>> adjList, int[] visit, ArrayList<Integer> path) {
        if (visit[crs] == 1) {
            return false;
        }

        if (adjList.get(crs).isEmpty()) {
            if (path.contains(crs) == false) {
                path.add(crs);
            }
            return true;
        }
        visit[crs] = 1;

        for (Integer preq : adjList.get(crs)) {
            if (dfs(preq, adjList, visit, path) == false) {
                return false;
            }
        }
        visit[crs] = 0;
        adjList.set(crs, new ArrayList<>()); // if this node is visited via another path
        path.add(crs);
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visit = new int[numCourses];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(numCourses);
        ArrayList<Integer> path = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] preq : prerequisites) {
            adjList.get(preq[0]).add(preq[1]);
        }

        for (int crs = 0; crs < numCourses; crs++) {
            if (dfs(crs, adjList, visit, path) == false) {
                return false;
            }
        }

        return true;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visit = new int[numCourses];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(numCourses);
        ArrayList<Integer> path = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] preq : prerequisites) {
            adjList.get(preq[0]).add(preq[1]);
        }

        int[] res = new int[numCourses];
        for (int crs = 0; crs < numCourses; crs++) {
            if (dfs(crs, adjList, visit, path) == false) {
                return new int[]{};
            }
        }

        for (int i = 0; i < path.size(); i++) {
            res[i] = path.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.canFinish(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {3, 4}}));
        // System.out.println(Arrays.toString(sc.findOrder(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {3, 4}})));
    }
}
