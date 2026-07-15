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
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = temp;
        for (int i=0; i<n; i++){
            curr = curr.next;
        }
        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = prev.next.next;
        return temp.next;
    }
}