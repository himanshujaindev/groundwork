
class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && (p.val == q.val);
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        helper h = new helper();
        TreeNode p = h.createTree(new Integer[]{1, 2});
        TreeNode q = h.createTree(new Integer[]{1, 2});

        h.printTree(p);
        h.printTree(q);

        System.out.println(sc.isSameTree(p, q));
    }
}
