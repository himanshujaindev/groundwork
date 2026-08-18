
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Definition for a Node.
class Node {

    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {

    private void dfs(Node oldNode, HashMap<Node, Node> hm) {

        // clone the node
        Node newNode = new Node(oldNode.val);
        hm.put(oldNode, newNode);

        for (Node neigh : oldNode.neighbors) {
            if (!hm.containsKey(neigh)) {
                dfs(neigh, hm);
            }
            // newNode.neighbors -> add new neighbors
            hm.get(oldNode).neighbors.add(hm.get(neigh));
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> hm = new HashMap<>();

        dfs(node, hm);
        return hm.get(node);
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        int[][] adjList = {{1, 2}, {1, 4}, {2, 1}, {2, 3}, {3, 2}, {3, 4}, {4, 1}, {4, 3}};
    }
}
