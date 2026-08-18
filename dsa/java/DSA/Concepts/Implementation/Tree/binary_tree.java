package DataStructures.Implementation.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binary_tree {

    // Level Order
    static TreeNode contructBinaryTree(int[] elements, int index) {
        TreeNode root = null;

        if (index < elements.length) {
            root = new TreeNode(elements[index]);
            root.left = contructBinaryTree(elements, 2 * index + 1); // Left child index wrt to cur node
            root.right = contructBinaryTree(elements, 2 * index + 2); // Right child index wrt to cur node
        }
        return root;
    }

    // Inorder Traversal = left root right
    static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    // Preorder Traversal = root left right
    static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Postorder Traversal = left right root
    static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        int[] elements = { 1, 2, 3, 4, 5, 6 };
        TreeNode root = contructBinaryTree(elements, 0);

        System.out.print("Inorder Traversal = ");
        inOrder(root);
        System.out.println();

        System.out.print("Preorder Traversal = ");
        preOrder(root);
        System.out.println();

        System.out.print("Postorder Traversal = ");
        postOrder(root);
        System.out.println();
    }
}
