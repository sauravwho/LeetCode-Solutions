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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        int a = 1;
        while(a < lists.length){
            for(int i = 0; i+a< lists.length; i+=a*2){
                lists[i] = mergeTwoLists(lists[i], lists[i+a]);
            }
            a*=2;
        }
        return lists[0];
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null) curr.next = list1;
        if(list2 != null) curr.next = list2;
        return temp.next;
    }
}