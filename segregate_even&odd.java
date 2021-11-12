public class segregate_even&odd {
    Node divide(int n, Node head){
        Node even_start=null,even_end=null,odd_start=null,odd_end=null,curr=head;
        while(curr!=null){
            int ele=curr.data;
            if(ele%2==0){
                if(even_start==null){
                    even_start=curr;
                    even_end=curr;
                }else{
                    even_end.next=curr;
                    even_end=even_end.next;
                }
            }else{
                if(odd_start==null){
                    odd_start=curr;
                    odd_end=curr;
                }else{
                    odd_end.next=curr;
                    odd_end=odd_end.next;
                }
            }
            curr=curr.next;
        }if(even_start==null)return odd_start;
        else if(odd_start==null)return even_start;
        odd_end.next=null;
        even_end.next=odd_start;
        return even_start;
    }
}
