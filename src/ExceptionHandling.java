public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int data=50/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code executes...");
    }
}
