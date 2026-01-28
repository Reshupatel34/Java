public class LinkedListPalindrome {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else if(head.next==null){
            head.next=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    //for printing
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
    public static Node head;
//    public static Node tail;

//    code for palindrome
    public  Node  findMid(Node head){
        if(head==null){
            System.out.println("LinkedList is empty");
           return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
       return slow;

    }
    public boolean palindrome(){
//        edge cases
        if(head==null || head.next==null){
            return true;
        }
//        find middle of the LinkedList
        Node mid=findMid(head);
        System.out.println(mid.data);
//        reverse the half linkedlist
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        LinkedListPalindrome ll=new LinkedListPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.palindrome());
    }
}
