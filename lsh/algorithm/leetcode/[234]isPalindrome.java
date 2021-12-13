https://leetcode.com/problems/palindrome-linked-list/description/

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

    public boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    
    ListNode rev = null;
    while(fast != null && fast.next != null && slow != null) {
      ListNode ptr = slow;
      slow = slow.next;
      fast = fast.next.next;
      
      ptr.next = rev;
      rev = ptr;
    }
    
    ListNode mid = slow;

    // ignore odd midpoint
    if (fast != null) mid = mid.next;
    

    while(rev != null && mid != null) {
      if(rev.val != mid.val) return false;
      rev = rev.next;
      mid = mid.next;
    }
    
    return true;
  }
}
