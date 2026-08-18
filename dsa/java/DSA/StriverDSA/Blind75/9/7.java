
class Solution {

    private boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isSame(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();

        TreeNode root = h.createTree(new Integer[]{1, 1});
        h.printTree(root);

        TreeNode subRoot = h.createTree(new Integer[]{1});
        h.printTree(subRoot);

        System.out.println(sc.isSubtree(root, subRoot));
    }
}
