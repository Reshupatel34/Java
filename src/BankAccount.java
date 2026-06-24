public class BankAccount {
    String name;
    int acc_num;

    BankAccount(String name,int acc_num){
        this.name=name;
        this.acc_num=acc_num;
    }
    public String toString(){
        return "Name : "+name+" Bank Acc Number : "+acc_num;
    }
//    @Override
//    public boolean equals(){
//        return obj1.equals(obj2);
//    }

    @Override
    public int hashCode(){
        return name.hashCode() ;
    }
    public static void main(String[] args) {
        BankAccount obj1=new BankAccount("xyz",123);
        BankAccount obj2=new BankAccount("abc",432);
        System.out.println(obj1.toString());

//        ==
//        System.out.println(equals(obj1.name,obj2.name));
        System.out.println(obj1.hashCode()== obj2.hashCode());

    }
}
