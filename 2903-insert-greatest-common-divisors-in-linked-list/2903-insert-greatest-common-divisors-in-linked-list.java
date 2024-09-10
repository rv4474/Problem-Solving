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
    public int GCD(int a,int b){
        if(b==0) return a;
        else
        return GCD(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode curr=head;
        ListNode fo=head;
        while(fo.next!=null){
            fo=curr.next;
            ListNode add=new ListNode(GCD(curr.val,fo.val));
            curr.next=add;
            add.next=fo;
            curr=fo;

        }
        
        return head;
    }
}