https://leetcode.com/problems/swap-nodes-in-pairs/description/

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode tmp = head.next;
        head.next = swapPairs(head.next.next);
        tmp.next = head;
        
        return tmp;
        
    }
}
