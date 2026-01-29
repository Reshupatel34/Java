import java.util.LinkedList;

public class LinkedListCollectionsFramework {
    public static void main(String[] args) {
//        since we know that linkedlist has an object inside it , so we have to give the class like -->
//        Integer,Character,String,etc , we cant give primitive datatype like int,float, etc
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(1);
        ll.addFirst(0);
        ll.addLast(2);
//        ll--->  0-->1--->2
        System.out.println(ll);

        ll.removeFirst();
        //0

        ll.removeLast();
        //2

        System.out.println(ll);
        //1
    }
}
