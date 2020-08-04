package days;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrimBst {

    public static void main(String[] args) {
        new TrimBst().trimBST(new TreeNode(1, new TreeNode(0), new TreeNode(2)), 1, 2);
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {
        Set<Integer> vals = new TreeSet<>();
        marshal(root, L, R, vals);
        Iterator<Integer> iterator = vals.iterator();
        TreeNode cur = new TreeNode(iterator.next());
        root = cur;
        while (iterator.hasNext()) {
            TreeNode tmp = new TreeNode(iterator.next());
            root.right = tmp;
            root = tmp;
        }
        return cur;
    }

    void marshal(TreeNode root, int L, int R, Set<Integer> vals) {
        if (root == null) return;
        int value = root.val;
        if (value >= L && value <= R) {
            vals.add(value);
        }
        marshal(root.left, L, R, vals);
        marshal(root.right, L, R, vals);
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
