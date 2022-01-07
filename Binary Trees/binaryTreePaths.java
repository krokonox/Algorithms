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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        findPaths(root, res, "");
        return res;
    }

    public void findPaths(TreeNode root, List<String> paths, String currentPath) {
        if(root.left == null && root.right == null) paths.add(currentPath + root.val);
        if(root.left != null) findPaths(root.left, paths, currentPath + root.val + "->");
        if(root.right != null) findPaths(root.right, paths, currentPath + root.val + "->");
    }
}
