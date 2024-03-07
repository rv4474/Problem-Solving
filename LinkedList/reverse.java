package LinkedList;

public class reverse {
    public ListNode reverseList(ListNode head) {
     ListNode res=head;
     ListNode fo=head;
     while(fo!=null){
          fo=head.next;
         if(res==head) 
         head.next=null;
         else{
             head.next=res;
         }
         res=head;
         head=fo;
     }
return res;
    }
    }