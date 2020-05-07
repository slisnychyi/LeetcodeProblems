package contest.may;

public class CousinTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Pair depthX = getDepth(null, root, 0, x);
        Pair depthY = getDepth(null, root, 0, y);
        return depthX.depth == depthY.depth && depthX.val != depthY.val;
    }

    public Pair getDepth(TreeNode parentNode, TreeNode current, int depth, int valueToFind) {
        if (current.val == valueToFind) {
            return new Pair(parentNode != null ? parentNode.val : -1, depth);
        }
        if (current.left != null) {
            Pair left = getDepth(current, current.left, depth + 1, valueToFind);
            if (left != null) return left;
        }
        if (current.right != null) {
            return getDepth(current, current.right, depth + 1, valueToFind);
        }
        return null;
    }
}

class Pair {
    final int val;
    final int depth;

    Pair(int val, int depth) {
        this.val = val;
        this.depth = depth;
    }
}

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
