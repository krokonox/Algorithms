// Leetcode 143. Reorder List
// https://leetcode.com/problems/reorder-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        // Get the middle of the list and split it in 2 parts
        
        ListNode prev = null;
        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Break connection between 2 lists 
        // 1->2->3->4->5->6
        // 1->2->3->null
        // 4->5->6
        
        prev.next = null;
        
        // Reverse the 2nd half of the linked list
        
        ListNode l2 = reverse(slow);
        
        // Merge 2 lists
        
        merge(l1, l2);
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public void merge(ListNode l1, ListNode l2) { 
        while(l1 != null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            
            l1.next = l2;
            
            if(l1_next == null) {
                break;
            }
            
            l2.next = l1_next;
            
            l1 = l1_next;
            l2 = l2_next;
        }
    }
}
