public class InheritanceMainClass {
    public static void main(String[] args) {


        A objA=new A();
        objA.m1();
        B objB=new B();
        objB.m2();

        A objc = new B();
//        B ke basis pe  runtime object decide hoga

//        can call this
//        we can override the method of parent class in this case A

        objc.m1();

//        cant call this---> Runtime Polymorphism (Which method would be called based on runtime obj)
//        objc.m2();





    }
}
