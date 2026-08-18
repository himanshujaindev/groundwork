
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> curLevelNodes = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curNode = queue.poll();
                curLevelNodes.add(curNode.val);
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
            res.add(curLevelNodes);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();
        TreeNode root = h.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        h.printTree(root);

        List<List<Integer>> levelOrder = sc.levelOrder(root);
        for (List<Integer> level : levelOrder) {
            System.out.println(level.toString());
        }
    }
}
