https://leetcode.com/problems/partition-list/description/

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
    public ListNode partition(ListNode head, int x) {
        ListNode prev = new ListNode();
        ListNode ans = prev;
        ListNode last = new ListNode();
        ListNode link = last;
        
        while(head !=null) {
            if(head.val < x) {
                prev.next = head;
                prev = head;
            } else {
                last.next = head;
                last = head;
            }
            
            head = head.next;
        }
        last.next = null;
        prev.next = link.next;
        return ans.next;
    }
}
