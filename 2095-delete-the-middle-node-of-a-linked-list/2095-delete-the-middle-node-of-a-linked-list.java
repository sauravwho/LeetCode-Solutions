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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode curr=head;
        ListNode mid=new ListNode(-1);
        mid.next=head;
        while(curr!=null && curr.next!=null ){
            curr=curr.next.next;
            mid=mid.next;
        }
        mid.next=mid.next.next;
        return head;   
    }
}