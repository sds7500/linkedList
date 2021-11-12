public class detect_loop_in_linkedList {
    public static boolean detectLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)return true;
        }
        return false;
    }
}
