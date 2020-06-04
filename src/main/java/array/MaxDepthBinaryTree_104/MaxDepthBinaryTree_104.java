package array.MaxDepthBinaryTree_104;

import contest.june.BinaryTreeInversion;

public class MaxDepthBinaryTree_104 {

    public static void main(String[] args) {
        System.out.println(1);
    }

    public boolean judgeCircle(String moves) {
        int result = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    result++;
                    break;
                case 'D':
                    result--;
                    break;
                case 'L':
                    result += 10;
                    break;
                case 'R':
                    result -= 10;
                    break;
            }
        }
        return result == 0;
    }

    public int maxDepth(TreeNode root) {
        return Math.max(count(root.left, 1), count(root.right, 1));
    }

    int count(TreeNode root, int count) {
        if (root == null) return count;
        count++;
        return Math.max(count(root.left, count), count(root.right, count));
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
