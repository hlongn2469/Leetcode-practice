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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode temp_next;
        ListNode prev = null;
        while(curr != null){
            temp_next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp_next;
        }
        return prev;
        
        //null <- 1 <- 2 <- 3 -> null
        //                  p     
        //                        c
        //                        t
    }
}