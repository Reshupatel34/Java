public class NumberFormatExceptionExmp {
    public static void main(String[] args) {

        try{
            int number=Integer.parseInt("XYZ");

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("code...");
    }
}
