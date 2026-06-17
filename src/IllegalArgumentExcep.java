public class IllegalArgumentExcep {
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age"+age);
    }
    public static void main(String[] args) {

        try{
            printAge(-3);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());;
        }
        System.out.println("hello");
    }
}
