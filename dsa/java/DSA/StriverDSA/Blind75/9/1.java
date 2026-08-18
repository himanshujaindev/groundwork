
class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();
        TreeNode root = h.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        h.printTree(root);
        System.out.println(sc.maxDepth(root));
    }
}
