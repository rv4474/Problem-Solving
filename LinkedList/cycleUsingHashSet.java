package LinkedList;

import java.util.HashSet;

//  * Definition for singly-linked list.
 class ListNode {
      int val;
    ListNode next;
    ListNode(int x) {
         val = x;
          next = null;
      }
 }
public class cycleUsingHashSet {
        public boolean detectCycle(ListNode head) {
            HashSet<ListNode> set=new HashSet<>();
            ListNode ptr=head;
             while(ptr!=null){
                if(set.contains(ptr)) return false;
                ptr=ptr.next;
            }
            return true;
        }
    }
