public class DoublyLLReverse {
    public static class  Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

        public static Node head;
        public static Node tail;

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;

            }
            System.out.println("null");
        }
        public void reverse(){
            if(head==null){
                System.out.println("DLL is empty");
                return;
            }
            Node previous=null;
            Node curr=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=previous;
                curr.prev=next;

                previous=curr;
                curr=next;

            }
            head=previous;
        }
        public static void main(String[] args) {
            DoublyLLReverse dll=new DoublyLLReverse();
            dll.addLast(1);
            dll.addLast(2);
            dll.addLast(3);
            dll.addLast(4);
            dll.addLast(5);
            dll.print();

            dll.reverse();
            dll.print();


    }
}
