public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        int leftTilt = findTilt(root.left);
        int rightTilt = findTilt(root.right);

        return Math.abs(sum(root.left) - sum(root.right)) + leftTilt + rightTilt;
    }

    public int sum(TreeNode root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
}
