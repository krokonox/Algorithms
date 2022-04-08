// Leetcode 116 
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

// BFS iterative

class Solution {
    
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            
            if(node != null) {
                if(node.right != null) {
                    node.left.next = node.right;
                    
                    if(node.next != null) {
                        node.right.next = node.next.left;
                    }
                    
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        
        return root;
    }
    
}
