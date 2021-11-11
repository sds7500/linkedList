// implementation of linked list in java

//Node: representing single node in linked list
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class implementation {

    public static int size(Node head){
        int res=0;
        while(head!=null){
            res++;
            head=head.next;
        }return res;
    }

    //traversing linked list and printing using loop
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    //traversing linked list and printing using recurssion
    public static void print_recursive(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        print_recursive(head.next);
    }

    //inserting at the head of linked list   
    public static Node insert_at_begin(int data,Node head){
        Node temp=new Node(data);
        temp.next=head;
        return temp;
    }

    // inserting at the end of linked list
    public static Node insert_at_end(int data,Node head){
        Node temp=new Node(data);
        if(head==null)return temp;
        Node curr=head;
        while(curr.next!=null)curr=curr.next;
        curr.next=temp;
        return head;
    }

    //insertion at given position
    public static Node insert_at_pos(int data,Node head,int pos){
        if(pos<=0 || pos>size(head)+1){
            System.out.println("Index out of range");
            return head;
        }else{
            if(pos==1)return insert_at_begin(data, head);
            else if(pos==size(head)+1)return insert_at_end(data, head);
            int count=1;
            Node curr=head;
            while(count<pos-1){
                curr=curr.next;
                count++;
            }
            Node temp=new Node(data);
            temp.next=curr.next;
            curr.next=temp;
            return head;
        }
    }

    //deletion at the front
    public static Node delete_at_front(Node head){
        if(head==null){
            System.out.println("The linked list is empty");
            return null;
        }head=head.next;
        return head;
    } 
    
    // deletion at end
    public static Node delete_at_end(Node head){
        if(head==null){
            System.out.println("The linked list is empty");
            return null;
        }else if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }

    //deletion at position
    public static Node delete_at_pos(Node head,int pos){
        int size=size(head);
        if(pos<=0 || pos>size){
            System.out.println("Index out of range");
            return null;
        }
        if(pos==1)return delete_at_front(head);
        else if(pos==size)return delete_at_end(head);
        Node curr=head;
        int count=1;
        while(count<pos-1){
            curr=curr.next;
            count++;
        }
        curr.next=curr.next.next;
        return head;
    }

    public static void main(String[] args){
        Node head=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes to be inserted in begininng: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the data to be inserted: ");
            int data=sc.nextInt();
            head=insert_at_begin(data, head);
        }
        System.out.print("Enter the number of nodes to be inserted in last: ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.print("Enter the data to be inserted: ");
            int data=sc.nextInt();
            head=insert_at_end(data, head);
        }
        print(head);
        head=delete_at_end(head);
        print(head);
        head=delete_at_front(head);
        print(head);
        System.out.print("Enter the position from where data is to be inserted: ");
        int pos=sc.nextInt();
        System.out.print("Enter the data to be inserted: ");
        int data=sc.nextInt();
        head=insert_at_pos(data, head, pos);
        print(head);
        System.out.print("Enter the position from where data is to be deleted: ");
        int pos2=sc.nextInt();
        delete_at_pos(head, pos2);
        print(head);
    }
}
