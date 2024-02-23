package LinkedList;

//  * Definition for singly-linked list.
 class ListNode {
      int val;
    ListNode next;
    ListNode(int x) {
         val = x;
          next = null;
      }
 }
public class cycleInll {
        public ListNode detectCycle(ListNode head) {
            if(head==null|| head.next==null) return null;
            ListNode ptr1=head;
            ListNode ptr2=head.next;
            while(ptr1!=ptr2){
                ptr1=ptr1.next;
                if(ptr1==null||ptr2==null) return null;
                ptr2=ptr2.next;
                if(ptr1==null||ptr2==null) return null;
                ptr2=ptr2.next; 
                
            }
            ptr1=head;
            ptr2=ptr2.next;
             while(ptr1!=ptr2){
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
            return ptr1;
        }
    }
