https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ListNode slow = ans;
        ListNode fast = ans;
        slow.next = head;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return ans.next;
    }
}
