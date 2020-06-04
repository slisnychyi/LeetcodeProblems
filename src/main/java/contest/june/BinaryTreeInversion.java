package contest.june;

public class BinaryTreeInversion {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode treeNode = new BinaryTreeInversion().invertTree(root);
        System.out.println(treeNode);
    }

    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }


    TreeNode invert(TreeNode current) {
        if (current == null) return null;
        if (current.left != null && current.right != null) {
            TreeNode tmp = current.right;
            current.right = current.left;
            current.left = tmp;
            invert(current.left);
            invert(current.right);
        }
        return current;
    }


    public static class TreeNode {
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

}
