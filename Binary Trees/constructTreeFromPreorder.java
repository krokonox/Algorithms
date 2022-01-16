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
    TreeNode root;

    public TreeNode bstFromPreorder(int[] preorder) {
        for(int x : preorder) {
            root = constructTree(x, root);
        }

        return root;
    }

    public TreeNode constructTree(int val, TreeNode root) {
        if(root == null) return new TreeNode(val);

        if(val > root.val) {
            root.right = constructTree(val, root.right);
        } else {
            root.left = constructTree(val, root.left);
        }

        return root;
    }
}
