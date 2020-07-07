package days;

public class ConvertSortedArrayToBst {

    public static void main(String[] args) {
        TreeNode result = new ConvertSortedArrayToBst().sortedArrayToBST(new int[]{0, 1, 2, 3, 4, 5});
        System.out.println(result);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return marshal(nums, 0, nums.length);
    }

    TreeNode marshal(int[] nums, int from, int to) {
        if (to - from == 0) return null;
        int mid = (from + to) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = marshal(nums, from, mid);
        root.right = marshal(nums, mid + 1, to);
        return root;
    }


    public class TreeNode {
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
