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
    public int len(ListNode head){
        if(head==null) return 0;
        return 1+len(head.next);
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int l=len(head);
        ListNode[] ans=new ListNode[k];
        if(l<=k){
            ListNode ptr=head;
            int i=0;
            while(ptr!=null){
                ListNode nw=ptr.next;
                ptr.next=null;
                ans[i++]=ptr;
                ptr=nw;
            }
            for(;i<k;i++){
                ans[i]=null;
            }
            return ans;
        }
        int p=l/k;
        int i=0;
        if(l%k==0){ 
            while(l>=1){
                ListNode ptr=head;
                int a=p;
                while(a>1){
                    ptr=ptr.next;
                    a=a-1;
                }
                l=l-p;
                ans[i++]=head;
                head=ptr.next;
                ptr.next=null;
            }
            return ans;
        }
        else{
            ListNode ptr=head;
            int a=p+1;
            int c=l%k;
            for(int b=0;b<c;b++)
            {
                ptr=head;
                a=p+1;
                while(a>1){
                    ptr=ptr.next;
                    a=a-1;
                }
                l=l-p+1;
                ans[i++]=head;
                head=ptr.next;
                ptr.next=null;
            }
           while(l>=1){
                ptr=head;
                a=p;
                while(a>1&&ptr!=null){
                    ptr=ptr.next; 
                    a=a-1;
                }
                l=l-p;
                if(i<k)
                ans[i++]=head;
                if(ptr!=null)
               { 
                head=ptr.next;
                ptr.next=null;
                }
            }
            return ans;
        }
    }
}