public class ArrayIndexException {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3,4};
            System.out.println(arr[5]);

        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err.getMessage());
        }
        System.out.println("code...");
    }
}
