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
    private int len(ListNode head){
      if(head==null) return 0;
      return len(head.next)+1;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      if(head==null|| head.next==null||k==1) return head;
        int l=len(head);
        int c=k;
        ListNode oh=null,ot=null, th=head,tt=head;
        while(l>=k){
          ListNode res=null;
          ListNode en=tt;
           while(k>0){
             tt=th.next;
             th.next=res;
             res=th;
             th=tt;
             k--;
           }
           k=c;
           if(oh==null){
             oh=res;
           }else{
            ot.next=res;  
           }
           ot=en;
           l=l-k;
        }
     if(l!=0) ot.next=tt; 
     return oh;
    }
}