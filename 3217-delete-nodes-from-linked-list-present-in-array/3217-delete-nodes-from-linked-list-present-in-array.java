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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
         ListNode ptr=head;
         ListNode ans=null;
         while(ptr!=null){
               if(set.contains(ptr.val)==false){
                ans=new ListNode(ptr.val);
                 ptr=ptr.next;
                break;
               }
               ptr=ptr.next;
         }
         ListNode pt=ans;
         while(ptr!=null){
               if(set.contains(ptr.val)==false){
                pt.next=new ListNode(ptr.val);
                pt=pt.next;
               }
               
               ptr=ptr.next;
         }
         return ans;
    }
}