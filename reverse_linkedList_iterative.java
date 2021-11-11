public class reverse_linkedList_iterative {
    Node reverseList(Node head)
    {
        Node prev=null,next=null,curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }head=prev;
        return head;
    }
}
