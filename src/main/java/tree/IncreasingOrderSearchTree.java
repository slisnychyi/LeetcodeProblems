package tree;

import java.util.LinkedList;
import java.util.Queue;

public class IncreasingOrderSearchTree {

    public static void main(String[] args) {
        new IncreasingOrderSearchTree().increasingBST(
                new TreeNode(5,
                        new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(8, null, new TreeNode(9)))
                )
        );
    }

    public TreeNode increasingBST(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        unmarshal(root, q);
        TreeNode result = new TreeNode(q.poll());
        TreeNode curr = result;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            TreeNode next = new TreeNode(q.poll());
            curr.right = next;
            curr = next;
        }
        return result;
    }

    void unmarshal(TreeNode root, Queue<Integer> q) {
        if (root.left != null) {
            unmarshal(root.left, q);
        }
        q.add(root.val);
        if (root.right != null) {
            unmarshal(root.right, q);
        }
    }

    static class TreeNode {
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
