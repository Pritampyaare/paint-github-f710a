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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        if(head == null || head.next == null) return null;
        
        while(n > 1){
          fast = fast.next;
          n--;
        }
        while(fast.next != null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev == null){
            return head.next;
        }
        prev.next = prev.next.next;
        
        return head;
    }
}