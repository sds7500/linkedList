public class reverse_in_sizeOfK {
    public static Node reverse(Node head, int k)
    {
        int count=0;
        Node curr=head,next=null,prev=null;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=reverse(next,k);
            head.next=rest_head;
        }
        return prev;
    }
}
