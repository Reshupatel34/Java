//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//
//        }
//
//
//    }
//
//    public  static Node head;
//    public static Node tail;
//    public static int size;
//
//
////    Methods
//
//    public void addFirst(int data){
////        creating a new node
//        Node newNode = new Node(data);
//        size++;
////        if head is null then
//        if(head==null){
//            head=tail=newNode;
//            return;
//        }
//
//        newNode.next=head;
//        head=newNode;
//
//
//
//
//    }
//    public void addLast(int data){
//        Node newNode = new Node(data);
//        size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//        tail.next=newNode;
//        tail=newNode;
//
//
//
//    }
//    public void print(){
//
//        if(head==null){
//
//            System.out.println("Linked list is empty");
//            return;
//
//        }
//
//        Node temp=head;
//
//        while(temp!=null){
//
//            System.out.print(temp.data+"-->");
//            temp=temp.next;
//
//        }
//        System.out.println("null");
//
//    }
//    public int removeFirst(){
//        if(size==0){
//            System.out.println("LinkedList is empty");
//            return Integer.MIN_VALUE;
//        }
//        else if(size==1){
//            int val=head.data;
//            head=tail=null;
//
//            size=0;
//            return val;
//
//        }
//        int val=head.data;
//        head=head.next;
//        size--;
//        return val;
//    }
//    public void add(int idx,int data){
//        if(idx==0){
//            addFirst(data);
//            return;
//        }
//        size++;
//        Node newNode = new Node(9);
//        Node temp=head;
//        int i=0;
//
//        while(i<idx-1){
//            temp=temp.next;
//            i++;
//        }
//
//        newNode.next=temp.next;
//        temp.next=newNode;
//
//
//
//    }
//    public int removeLast(){
//        if(size==0){
//            System.out.println("LinkedList is empty");
//            return Integer.MIN_VALUE;
//        }
//        else if(size==1){
//            int val=head.data;
//            head=tail=null;
//            size=0;
//        }
//        Node prev=head;
//        for(int i=0;i<size-2;i++){
//           prev=prev.next;
//        }
//        int val=prev.next.data; // data of tail we could also wite tail.data
//        prev.next=null;
//        tail=prev;
//        size--;
//        return val;
//    }
//    public int itrSearch(int Key){
//        if(size==0){
//            System.out.println("LinkedList is Empty");
//            return -1;
//
//        }
//        Node temp=head;
//        int i=0;
//        while(temp!=null){
//            if(temp.data==Key){
//                return i;
//            }
//            temp=temp.next;
//            i++;
//        }
//        return -1;
//    }
//    public int helper(Node head,int Key){ //O(n)
//        if(head==null){
//            return -1;
//        }
//        if(head.data==Key){
//            return 0;
//        }
//        int idx=helper(head.next,Key);
//        if(idx==-1){
//            return -1;
//        }
//        return idx+1;
//    }
//    public int recSearch(Node head,int Key){
//        return helper(head,Key);
//    }
//    public void reverse(){
//
//        if(head==null){
//            System.out.println("LinkedList is Empty");
//            return;
//        }
//
//        Node prev=null;
//        Node curr=head;
//        Node next;
//        while(curr!=null){
//             next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//       head=prev;
//    }
//    public static void main(String[] args) {
//      LinkedList ll=new LinkedList();
//        ll.print();
//        ll.addFirst(2);
//        ll.print();
//        ll.addFirst(1);
//        ll.print();
//        ll.addLast(3);
//        ll.print();
//        ll.addLast(4);
//        ll.print();
//        ll.add(2,9);
//        ll.print();
//        System.out.println(ll.size);
//       // ll.removeFirst();
//        ll.print();
//      //  ll.removeLast();
////        ll.print();
////        System.out.println(ll.size);
////        System.out.println(ll.itrSearch(9));
////        System.out.println(ll.recSearch(head,4));
////        System.out.println(ll.recSearch(head,14));
//       ll.reverse();
//       ll.print();
//    }
//
//}
