import java.util.*;
public class POD190ReverseBits {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n==0)System.out.print(0);

       int result=0;
//       for 32 bits
        for(int i=1;i<=32;i++){
            result<<=1; //to make place for lsb in result
            result=result|(n&1); //to get the lsb
            n>>=1;


        }
        System.out.println(result);
    }
}
