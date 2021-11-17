public class merge_2sorted_linkedList {
    Node sortedMerge(Node head1, Node head2) {
        Node curr1=head1,curr2=head2;
        Node tail,head;
        if(curr1.data<curr2.data){
            tail=curr1;
            curr1=curr1.next;
        }else{
            tail=curr2;
            curr2=curr2.next;
        }head=tail;
        while(curr1!=null && curr2!=null){
            if(curr1.data<curr2.data){
                tail.next=curr1;
                curr1=curr1.next;
            }else{
                tail.next=curr2;
                curr2=curr2.next;
            }
            tail=tail.next;
        }
        if(curr1!=null)tail.next=curr1;
        else tail.next=curr2;
        return head;
   } 
}
