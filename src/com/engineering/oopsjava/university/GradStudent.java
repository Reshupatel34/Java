package com.engineering.oopsjava.university;
import com.engineering.oopsjava.university.Student;

public class GradStudent extends Student{
    String thesis;
    GradStudent(String name, int age, int StudentId, double gpa,String thesis){
        super(name,age,StudentId,gpa);
        this.thesis=thesis;
        System.out.println("GradStudent constructor");
    }
    @Override
    public String toString(){
        return super.toString()+" THESIS : "+thesis;
    }
}
