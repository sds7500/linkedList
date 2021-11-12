public class delete_node_without_headPointer {
    void deleteNode(Node del)
    {
        del.data=del.next.data;
        del.next=del.next.next;
    }
}
