https://leetcode.com/problems/middle-of-the-linked-list/description/


class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        
        while(twoStep != null && twoStep.next != null){
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        
        return oneStep;
    }
}
