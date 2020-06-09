package tree;


public class SearchInBinaryTree_700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val > root.val) return searchBST(root.right, val);
        if (val < root.val) return searchBST(root.left, val);
        return root;
    }

    class TreeNode {

        int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
