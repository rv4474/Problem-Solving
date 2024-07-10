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
public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
         ListNode ptr1=head;
         ListNode ptr2=head.next;
         ListNode ptr3=head.next.next;
         ListNode ptr4=head.next;
         int c=0;
         ListNode ptr5=null;
         while(true){
             ptr2.next=ptr1;
             ptr1.next=ptr3;
             if(c==1)  ptr5.next=ptr2;
             ptr5=ptr1;
             c=1;
             if(ptr1.next==null) break;
             ptr1=ptr1.next;
             ptr2=ptr2.next;
             ptr2=ptr2.next;
             ptr2=ptr2.next;
             if(ptr3.next==null||ptr3==null) break;
             ptr3=ptr3.next;
             ptr3=ptr3.next; 
             
             
            
         }
      return ptr4;
    }
    }
