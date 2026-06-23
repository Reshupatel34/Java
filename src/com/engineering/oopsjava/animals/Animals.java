package com.engineering.oopsjava.animals;

public class Animals {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void eat(){
        System.out.println("This animal eats food");
    }

    public void sayHello(){
//        System.out.println("");
    }
}
