package com.engineering.oopsjava.university;

public class Person {

    private  String name;
    private  int age;
    Person( String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Person Constructor");
    }

//    method for overriding toString() method
    @Override
    public String toString(){
     return "name : "+name+" and : "+age;
    }
}
