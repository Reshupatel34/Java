
class A{
    void m1(){
        System.out.println("A");
    }
}
class B extends A{
    void m2(){
        System.out.println("B");
    }

    @Override
    void m1(){
        System.out.println("Overriden from m1 A ");
    }
}
public class InheritanceClass {



}
