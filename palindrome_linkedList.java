public class palindrome_linkedList {
    boolean isPalindrome(Node head) 
    {
        Node middle=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            middle=middle.next;
            fast=fast.next.next;
        }
        Node curr=middle.next,next=null,prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        middle.next=prev;
        curr=middle.next;
        while(curr!=null){
            if(curr.data!=head.data)return false;
            head=head.next;
            curr=curr.next;
        }
        return true;
    }    
}
