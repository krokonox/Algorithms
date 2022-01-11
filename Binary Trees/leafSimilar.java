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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> values1 = new ArrayList();
        List<Integer> values2 = new ArrayList();

        dfs(root1, values1);
        dfs(root2, values2);
        return(values1.equals(values2));
    }

    public void dfs(TreeNode root, List<Integer> values) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                values.add(root.val);
            }

            dfs(root.left, values);
            dfs(root.right, values);
        }
    }
}
