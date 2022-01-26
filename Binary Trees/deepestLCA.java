/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int deepest = 0;
    TreeNode lca;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        findMaxDepth(root, 0);
        return lca;
    }

    public int findMaxDepth(TreeNode root, int currDepth) {
        deepest = Math.max(deepest, currDepth);

        if(root == null) return currDepth;

        int left = findMaxDepth(root.left, currDepth + 1);
        int right = findMaxDepth(root.right, currDepth + 1);

        if(left == deepest && right == deepest) {
            lca = root;
        }

        return Math.max(left, right);
    }
}
