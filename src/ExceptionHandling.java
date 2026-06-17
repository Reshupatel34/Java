public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int data=50/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
//        System.out.println("rest of the code executes...");


//        null pointer error
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException err){
            System.out.println(err.getMessage());
        }
        System.out.println("code....");
    }
}
