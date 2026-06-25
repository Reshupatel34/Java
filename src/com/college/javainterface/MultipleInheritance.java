package com.college.javainterface;


interface Add{
    void add(int a,int b);
}
interface Sub{
    void sub(int a,int b);
}
class MultipleInheritance implements Add , Sub
{
    @Override
    public void add(int a,int b){
        a=(a+b);
        System.out.println("a+b : "+a);
    }
    @Override
    public void sub(int a,int b){
        a=(a-b);
        System.out.println("a-b : "+a);
    }
}

class Test1{
    public static void main(String[] args) {
        MultipleInheritance t=new MultipleInheritance();
        t.add(2,3);
        t.sub(3,2);
    }
}