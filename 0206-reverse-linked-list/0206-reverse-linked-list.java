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
    public ListNode reverseList(ListNode head) {
         ListNode ptr=null;
ListNode ptr2=null;
while(head!=null){
ptr2=head.next;
head.next=ptr;
ptr=head;
head=ptr2;
}
head=ptr;
return head;
    }
}