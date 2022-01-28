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
    HashSet<Integer> set = new HashSet<>();
    List<TreeNode> list = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int val : to_delete) {
            set.add(val);
        }

        helper(root);

        if(!set.contains(root.val)) {
            list.add(root);
        }

        return list;
    }

    public TreeNode helper(TreeNode root) {
        if(root == null) return null;

        root.left = helper(root.left);
        root.right = helper(root.right);

        if(set.contains(root.val)) {
            if(root.left != null) list.add(root.left);
            if(root.right != null) list.add(root.right);
            return null;
        }

        return root;
    }
}
