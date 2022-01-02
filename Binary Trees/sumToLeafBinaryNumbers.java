
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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int sum) {
        if(root == null) return 0;
        sum = (sum << 1) + root.val;

        if(root.left == null && root.right == null) return sum;

        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
