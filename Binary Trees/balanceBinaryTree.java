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
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return construct(arr, 0, arr.size() - 1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public TreeNode construct(ArrayList<Integer> arr, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr.get(mid));

        node.left = construct(arr, start, mid - 1);
        node.right = construct(arr, mid + 1, end);

        return node;
    }
}
