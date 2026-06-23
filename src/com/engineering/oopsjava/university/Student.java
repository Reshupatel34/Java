package com.engineering.oopsjava.university;

import com.engineering.oopsjava.university.Person;

public class Student extends Person {
    final  int StudentId;
    double gpa;
    Student(String name, int age, int StudentId, double gpa ){
        super(name,age);
        this.StudentId = StudentId;
        this.gpa=gpa;
        System.out.println("Student constructor");
    }
    @Override
    public String toString(){

        return super.toString()+ "Student ID : "+StudentId+" gpa : "+gpa;
    }
}
