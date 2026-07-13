package com.college.javainterface.dsa;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void addFirst(T data){
      Node<T> newNode=new Node<>(data);
      if(head==null){
          head=tail=newNode;

      }else{
          newNode.next=head;
          head=newNode;
      }

    }
    public void printLL(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
    }
    public void addLast(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null) {
            head=tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeFirst(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("LL is Null");
            return;
        }else{
            head=head.next;
            temp.next=null;
        }
    }

    public void removeLast(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("LL is Null");
            return;
        }else{
            while(temp.next.next!=null){
                temp=temp.next;

            }
            tail=temp;
            temp.next=null;
        }
    }
    public void find(T data){
        Node<T> temp=head;
        while(temp.data!=data){
            temp=temp.next;
        }
    }
}
