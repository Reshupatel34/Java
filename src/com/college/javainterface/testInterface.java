package com.college.javainterface;

interface testInterface {

    final int a=10;

//    abstract method
    void display();

}

class TestClass implements testInterface{
//    implementing the capabilities of interfaces
    public void display(){
        System.out.println("implemented  an interface abstract method");
    }

}

class TestMain{
    public static void main(String[] args) {
        TestClass test=new TestClass();

        test.display();
        System.out.println(test.a);
    }
}

