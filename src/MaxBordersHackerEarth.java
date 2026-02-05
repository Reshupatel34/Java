import java.util.*;
public class MaxBordersHackerEarth {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String[] grid=new String[2];
       for(int i=0;i<2;i++){
           grid[i]=sc.next();
       }

       int rowCount=0;
       int colCount=0;

       for(int i=0;i<2;i++){
           int count=1;
           for(int j=0;j<2;j++){
               if(grid[i].charAt(j)=='#' && grid[i].charAt(j+1)=='#'){
                   count++;
                   rowCount=Math.max(rowCount,count);
               }
               else{
                  count=1;
               }
           }

       }
        for(int j=0;j<3;j++){
            int count=1;
            for(int i=0;i<1;i++){
                if(grid[i].charAt(j)=='#' && grid[i+1].charAt(j)=='#'){
                    count++;
                    colCount=Math.max(colCount,count);
                    System.out.print("rowcount="+colCount);
                }
                else{
                    count=1;
                }
                System.out.println();
            }

        }
        System.out.print("rowCount="+rowCount+" "+"colCount="+colCount);
        System.out.println();
        int ans=Math.max(rowCount,colCount);
        System.out.print(ans);
        System.out.println();
    }
}
