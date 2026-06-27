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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode curr = l3;
        int c = 0;
        while(l1 != null || l2 != null || c != 0 ){
            int v1 = (l1 != null)?l1.val : 0;
            int v2 = (l2 != null)?l2.val : 0;
            int temp = v1+v2+c;
            c = temp/10;
            curr.next = new ListNode(temp%10);
            curr = curr.next;
            if(l1 != null) l1=l1.next;
            if(l2 != null) l2=l2.next;
        }
        return l3.next;
    }
}