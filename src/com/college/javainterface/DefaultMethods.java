package com.college.javainterface;

interface DefaultMethods {
    final int a=2;
    default void display(){
        System.out.println("Using default keyword we can implement the methods in interface class");
    }

}

class TestClass1 implements DefaultMethods{
    public static void main(String[] args) {
        TestClass1 t=new TestClass1();
        t.display();
    }
}