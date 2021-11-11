// code to insert data in sorted manner in sorted linked list

public class insert_in_sorted_linked_list {
    Node sortedInsert(Node head, int data) {
        Node node=new Node(data);
        if(head==null)return node;
        if(head.data>data){
            node.next=head;
            return node;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<data)
            curr=curr.next;
        node.next=curr.next;
        curr.next=node;
        return head;
    }
}
