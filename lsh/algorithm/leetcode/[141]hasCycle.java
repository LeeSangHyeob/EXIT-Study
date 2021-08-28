https://leetcode.com/problems/linked-list-cycle/

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) return false;
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        
        while(head.next != null) {
            head = head.next;
            if(set.contains(head)) return true;
            set.add(head);
        }
        
        return false;
    }
}
