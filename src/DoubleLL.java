public class DoubleLL {

    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }


    }
    public static Node head;
    public static Node tail;
    public static int size;

//    add an element
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


    }
    public void print(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }
//    remove first
    public void removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }
        head=head.next;
        head.prev=null;
        size--;

    }

//    add an element at the last of the DLL
    public void addLast(int data){

        Node newNode=new Node(data);
        if(head==null){
           head=tail=newNode;
           return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }

//    remove an element from the tail/Last
    public void removeLast(){
        if(head==null){
            System.out.println("DLL is Empty");
            return;
        }
        Node temp=head;
        Node previous=null;

        while(temp.next!=null){
            previous=temp;
            temp=temp.next;

        }
        previous.next=null;
        tail.prev=null;
        size--;
    }

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
        System.out.println(size);
        dll.addLast(5);
        dll.print();
        System.out.println(size);
        dll.removeLast();
        dll.print();
        System.out.println(size);



    }
}
