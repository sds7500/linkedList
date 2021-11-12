public class remove_loop_from_linkedList {
    public static void removeLoop(Node head){
    
        Node slow=head,fast=head;
        int flag=0;
        while(slow !=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==1){
            slow=head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
            else{
                while(fast.next!=slow){
                    fast=fast.next;
                }
            }
            fast.next=null;
        }
        return;
    }
}
