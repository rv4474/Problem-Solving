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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){ 
        ans.add(ptr.val);
        ptr=ptr.next;
        }
        int i=0,j=ans.size()-1;
        while(i<=j){
            if(ans.get(i)!=ans.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}