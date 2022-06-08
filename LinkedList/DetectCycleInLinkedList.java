/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
// Leetcode 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null) {
            if(slow == fast) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
