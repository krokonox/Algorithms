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
    int maxLevel = 0;
    TreeNode deepest;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return deepest;
    }

    public int dfs(TreeNode root, int currLevel) {
        if(root == null) return currLevel;
        int left = dfs(root.left, currLevel + 1);
        int right = dfs(root.right, currLevel + 1);

        if(left == right) {
            maxLevel = Math.max(left, maxLevel);
            if(left == maxLevel) deepest = root;
        }

        return Math.max(left, right);
    }
}
