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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();

        if(n == 1) {
            res.add(new TreeNode(0));
            return res;
        }

        n--;

        for(int i = 1; i < n; i+= 2) {
            List<TreeNode> leftTrees = allPossibleFBT(i);
            List<TreeNode> rightTrees = allPossibleFBT(n - i);

            for(TreeNode lt: leftTrees) {
                for(TreeNode rt: rightTrees) {
                    TreeNode curr = new TreeNode(0);
                    curr.left = lt;
                    curr.right = rt;
                    res.add(curr);
                }
            }
        }

        return res;
    }
}
