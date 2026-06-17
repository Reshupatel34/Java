
//Exception Propagation --> is a reason why we use throw , to send the exception to the caller

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;
public class FileNotFoundException {
    static void method1(){
        try {
            ProductService.calculateTotal();
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
//        checkedException
       method1();

    }
}
