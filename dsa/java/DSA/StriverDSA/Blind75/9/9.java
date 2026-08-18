
class Solution {

    private boolean valid(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }

        if (!(left < root.val && root.val < right)) {
            return false;
        }

        return valid(root.left, left, root.val) && valid(root.right, root.val, right);
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();

        TreeNode root = h.createTree(new Integer[]{2147483647});
        h.printTree(root);

        System.out.println(sc.isValidBST(root));
    }
}
