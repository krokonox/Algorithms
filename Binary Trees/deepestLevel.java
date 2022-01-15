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
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
       if(root == null) return 0;
       int sum = 0;
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);

       while(!q.isEmpty()) {
           int size = q.size();
           sum = 0;

           for(int i = 0; i < size; i++) {
               TreeNode node = q.poll();
               sum += node.val;
               if(node.left != null) q.offer(node.left);
               if(node.right != null) q.offer(node.right);
           }
       }

       return sum;
    }



    public int deepestLeavesSum(TreeNode root) {
        calculateSum(root, 0);
        return sum;
    }

    public void calculateSum(TreeNode root, int level) {
        if(root == null) return;

        if(level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }

        if (maxLevel == level) {
            sum += root.val;
        }

        calculateSum(root.left, level + 1);
        calculateSum(root.right, level + 1);
    }
}
