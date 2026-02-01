import java.util.*;
public class LinkedListMergerSort {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public  Node getMid(Node head){
        Node slow= head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
//
    }
    public  void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        if(head.next==null){
            head.next=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;



    }
    public  Node mergesort(Node head){
//   find mid
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
//        righthalf k ahead
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergesort(head);
        Node newRight=mergesort(rightHead);

//        merge
        return merge(newLeft,newRight);


    }
    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }


        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
//        .next isiliye kiya hai kyuki mergeLL ka pahla node -1 hai
        return mergeLL.next;
    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedListMergerSort ll=new LinkedListMergerSort();

         ll.addLast(2);
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(9);
        ll.addLast(1);

         ll.print();
       ll.head= ll.mergesort(ll.head);

       ll.print();



    }
}
