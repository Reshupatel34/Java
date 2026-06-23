import java.util.*;

public class StudentInheritance {


    String name;


    StudentInheritance(String name){
        this.name=name;
    }

    boolean equals(String name){
        return this.name==name;
    }

    public static void main(String[] args) {

         StudentInheritance stu1=new StudentInheritance("ABC");
         StudentInheritance stu2=new StudentInheritance("ABC");

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1==stu2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentInheritance that = (StudentInheritance) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
