import java.util.*;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
         super(message);
    }
}
public class HospitalBillingSystemExceptionHandling {

    static void makePayments(int balance,int billAmount) throws InsufficientFundsException {
        if(balance<billAmount){
            throw new InsufficientFundsException("Not Enough Balance in the Account");
        }
        System.out.println("Payment Succefully Done");

    }
    static void PatientInfo(String[] patient,int index){
        try{
            System.out.println(patient[index]);
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Exception in patient data "+err.getMessage());
        }
    }
    static void patientId(String patientID){
      try{
          int id=Integer.parseInt(patientID);
          System.out.println("Patients id : "+id);
      }catch(NumberFormatException err){
          System.out.println(err.getMessage());
      }
    }
    static void Bills(int totalPayment,int items){
          try{
              int billPerItem=totalPayment/items;
              System.out.println("Bill per items : "+billPerItem);
          }catch(ArithmeticException err){
              System.out.println("ArithmeticExpetion Occured : "+err.getMessage());
          }
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String[] patient ={"pt1","pt2","pt3","pt4"};

        PatientInfo(patient,5);

     String patientID=sc.next();

        patientId(patientID);

     int totalPayment=sc.nextInt();
     int items=sc.nextInt();

     Bills(totalPayment,items);

      int balance=1000;
      int billAmount=1500;
     try{
         makePayments(balance,billAmount);
     }catch(InsufficientFundsException err){
         System.out.println(err.getMessage());
     }finally{
         System.out.println("Transaction process completed");
     }
    sc.close();




    }
}
