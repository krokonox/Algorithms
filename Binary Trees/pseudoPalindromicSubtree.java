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
    int res = 0;

    public int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> nodes = new HashSet<>();
        helper(root, nodes);
        return res;
    }

    public void helper(TreeNode root, Set<Integer> nodes) {
        if(root == null) return;

        if(nodes.contains(root.val)) {
            nodes.remove(root.val);
        } else {
            nodes.add(root.val);
        }

        if(root.left == null && root.right == null) {
            if(nodes.size() <= 1) res++;
        }

        helper(root.left, new HashSet(nodes));
        helper(root.right, new HashSet(nodes));
    }
}
