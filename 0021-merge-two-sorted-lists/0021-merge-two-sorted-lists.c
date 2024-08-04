/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insert(struct ListNode* head,int data){

     struct ListNode * second = (struct ListNode *)malloc(sizeof(struct ListNode));
     struct ListNode* p=head;
     second->val = data;
        second->next=NULL;
    if(head==NULL){
        head=second; 
    }
    else {
        while(p->next!=NULL){
        p=p->next;
     }
     p->next=second;
     p=p->next;
    }
    return head;
}

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
struct ListNode*ptr=(struct ListNode *)malloc(sizeof(struct ListNode));
ptr=NULL;
struct ListNode*p1=list1;
struct ListNode*p2=list2;
while(p1!=NULL&&p2!=NULL){
if(p1->val<p2->val){
ptr=insert(ptr,p1->val);
p1=p1->next;
}
else{
    ptr=insert(ptr,p2->val);
    p2=p2->next;
}
}
while(p1!=NULL){
    ptr=ptr=insert(ptr,p1->val);
    p1=p1->next;
}
while(p2!=NULL){
    ptr=ptr=insert(ptr,p2->val);
    p2=p2->next;
}
return ptr;
}