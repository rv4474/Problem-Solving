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
    int c;
    public void twice(ListNode head){
        if(head.next!=null){
            twice(head.next);
        }
        int a=2*head.val+c;
        if(a>=10){
          c=1;
          head.val=a-10;
        }
        else{
            head.val=a;
            c=0;
        }
    }
    public ListNode doubleIt(ListNode head) {
     c=0;
     twice(head);
     if(c==1){
      ListNode nw=new ListNode(1);
      nw.next=head;
      return nw;
     }
     return head;
    }
}