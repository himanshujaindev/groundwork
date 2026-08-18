package DataStructures.Implementation.Tree;

public class bst {

    static TreeNode contructBST(int[] elements, int start, int end) {
        TreeNode root = null;
        if (start <= end) {
            int mid = (start + end) / 2;
            root = new TreeNode(elements[mid]);
            root.left = contructBST(elements, start, mid - 1);
            root.right = contructBST(elements, mid + 1, end);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] elements = { 1, 2, 3, 4, 5, 6, 7 };
        TreeNode root = contructBST(elements, 0, elements.length - 1);

        // BST Traversal

        System.out.print("Inorder Traversal (Sorted order) = ");
        binary_tree.inOrder(root);
        System.out.println();

        System.out.print("Preorder Traversal (Tree Structure) = ");
        binary_tree.preOrder(root);
        System.out.println();

        // Sum of elements in BST
    }
}
