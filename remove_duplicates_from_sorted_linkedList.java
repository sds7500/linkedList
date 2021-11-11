public class remove_duplicates_from_sorted_linkedList {
    Node removeDuplicates(Node head)
    {
	    Node curr=head,temp=head.next;
	    while(temp!=null){
	        if(curr.data==temp.data)curr.next=temp.next;
	        else curr=curr.next;
	        temp=temp.next;
	    }
	    return head;
    }
}
