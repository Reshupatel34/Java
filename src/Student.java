public class Student {
//     only non-static methods
     private String name;
     private String email;
     private int rollno;

   public  void setName(String name){
          this.name=name;
     }
   public  String getName(){
          return name;
     }
     public static void main(String[] args) {
         Student st1=new Student();
         st1.setName("Reshu");
          System.out.println( st1.getName());

     }
}
