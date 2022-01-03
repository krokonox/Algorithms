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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        List<Double> result = new ArrayList<>();

        while (queue.size() > 0) {
            int size = queue.size(); 
            double sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            result.add(sum/size);
        }

        return result;
    }
}
