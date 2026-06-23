package com.engineering.oopsjava.humans;

public class GrandParent {
    private String name;

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    private boolean hasSuperPowers;

//    khud ka contructor
    public GrandParent(){
//        hasSuperPowers=true;
        System.out.println("Grand parent contructor called");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}
