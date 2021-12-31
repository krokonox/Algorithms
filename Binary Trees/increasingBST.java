
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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList();
        inOrder(root, values);
        TreeNode newTree = new TreeNode(0), curr = newTree;

        for (int val: values) {
            curr.right = new TreeNode(val);
            curr = curr.right;
        }

        return newTree.right;
    }

    public void inOrder(TreeNode root, List<Integer> values) {
        if (root == null) return;
        inOrder(root.left, values);
        values.add(root.val);
        inOrder(root.right, values);
    }
}
