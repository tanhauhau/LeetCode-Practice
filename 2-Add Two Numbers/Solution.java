/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ans = null;
        ListNode head = null;
        int carry = 0;
        while(l1 != null || l2 !=null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + carry;
            carry = sum > 9 ? 1: 0;
            ListNode node = new ListNode(sum % 10);
            if (head == null) {
                head = node;
                ans = head;
            } else {
                head.next = node;
                head = head.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry > 0) {
            ListNode node = new ListNode(carry);
            head.next = node;
        }
        return ans;
    }
}
