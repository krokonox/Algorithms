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
    public TreeNode inOrderTraversal(TreeNode root) {
        if(root == null) return null;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root.val);

        while(stack.size() > 0) {
          int curr = stack.pop();

          if(curr.right != null) stack.push(curr.right);
          if(curr.left != null) stack.push(curr.left);
        }
    }
}
