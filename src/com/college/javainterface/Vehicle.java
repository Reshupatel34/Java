package com.college.javainterface;

interface Vehicle {

//    abtract methods
//    interface achieves 100 percent abstraction
    void changeGear(int a);
    void speedup(int a);
    void applyBrakes(int a);


}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
        System.out.println("Changed gear : "+gear);
    }

     @Override
    public void speedup(int increment){
        speed+=increment;
        System.out.println("New Speed : "+speed);
    }

    @Override
    public void applyBrakes(int dec){
        speed=speed-dec;
        System.out.println("New dec speed : "+speed);
    }

}

class Test{

    public static void main(String[] args) {
       Bicycle cycle=new Bicycle();
       cycle.speedup(10);
       cycle.changeGear(3);
       cycle.applyBrakes(4);
    }

}