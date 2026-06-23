
public class Account {
    private int acc_number;
    private int balance;
    private String name;
    private static int TotalAcc;
    Account(String name,int balance,int acc_number){
        this.name=name;
        this.balance=balance;
        this.acc_number=acc_number;
        TotalAcc++;
    }
     void deposit(int moneyDeposit){
           balance+=moneyDeposit;

     }
     void withdraw(int moneyWithdraw){
        if(balance>0 && balance>moneyWithdraw) {
            balance -= moneyWithdraw;
        }

     }
     void getStatement(){
         System.out.println("Account Number : "+acc_number+" Balance : "+balance+" Name : "+name);
     }

    public static void main(String[] args) {
        Account acc1 = new Account("Charlie",5000,123456);
        Account acc2 = new Account("Bob",4000,345677);
        Account acc3 = new Account("Dylan",3000,765432);

        acc1.deposit(2000);
        System.out.println(acc1.balance);
        acc1.withdraw(2000);
        System.out.println(acc1.balance);
        acc1.getStatement();
    }
}
