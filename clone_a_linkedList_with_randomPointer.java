public class clone_a_linkedList_with_randomPointer {
    Node copyList(Node head) {
        Node curr=head,temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null && curr.next!=null){
            temp=curr.next;
            if(curr.arb!=null)temp.arb=curr.arb.next;
            curr=curr.next.next;
        }
        Node orignal=head,copy=head.next;
        temp=copy;
        while(orignal!=null){
            orignal.next=orignal.next.next;
            if(copy.next!=null)
            copy.next=copy.next.next;
            orignal=orignal.next;
            copy=copy.next;
        }
        return temp;
    }
}
