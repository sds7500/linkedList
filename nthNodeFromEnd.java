public class nthNodeFromEnd {
    int getNthFromLast(Node head, int n)
    {
    	Node fast=head,slow=head;
        int count=0;
    	while(count<n && fast!=null){
    	    fast=fast.next;
    	    count++;
    	}
    	if(fast==null && count==n)return head.data;
    	if(fast==null)return -1;
    	while(fast!=null){
    	    fast=fast.next;
    	    slow=slow.next;
    	}
    	return slow.data;
    }
}
