package com.college.javainterface.dsa;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();


        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.removeFirst();
        ll.removeLast();
        ll.printLL();
    }
}
