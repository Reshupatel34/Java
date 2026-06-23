package com.engineering.oopsjava.test;

import com.engineering.oopsjava.animals.Dog;
import com.engineering.oopsjava.humans.Child;
import com.engineering.oopsjava.humans.Parent;
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("mushu");
        System.out.println(dog.getName());
         dog.eat();
        dog.sayHello();


//        multilevel inheritance
        Child child = new Child();
        child.setAge(3);
        System.out.println( child.getAge());

        Parent parent=new Parent();
        parent.setName("Ram");
        System.out.println(parent.getName());

//        Parent obj1= new Child();


    }

}
