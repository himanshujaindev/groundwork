
class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();
        TreeNode root = h.createTree(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        h.printTree(root);
        TreeNode invertedTreeRoot = sc.invertTree(root);
        h.printTree(invertedTreeRoot);
    }
}
