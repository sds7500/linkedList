public class intersection_point_of_2_linkedList {
    int intersectPoint(Node head1, Node head2)
	{
         Node curr1=head1,curr2=head2;
         int count1=0,count2=0;
         while(curr1!=null){
             curr1=curr1.next;
             count1++;
         }
         while(curr2!=null){
             curr2=curr2.next;
             count2++;
         }
         curr1=head1;
         curr2=head2;
         if(count1>count2){
            int diff=count1-count2;
            int i=0;
            while(i<diff){
                curr1=curr1.next;
                i++;
            }
            while(curr1!=null && curr2!=null){
                if(curr1==curr2)return curr1.data;
                curr1=curr1.next;
                curr2=curr2.next;
            }
            return -1;
         }else{
            int diff=count2-count1;
            int i=0;
            while(i<diff){
                curr2=curr2.next;
                i++;
            }
            while(curr1!=null && curr2!=null){
                if(curr1==curr2)return curr1.data;
                curr1=curr1.next;
                curr2=curr2.next;
            }
            return -1;
         }
	}
}
