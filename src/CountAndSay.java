import java.util.*;
public class CountAndSay {
    public static void count(int n,StringBuilder str){
        if(n==1) return;
        int i=0;
        StringBuilder oldStr=new StringBuilder(str);
        str.setLength(0);

        while(i<oldStr.length()){
            int j=i+1;
            int count=1;
            while(j<oldStr.length()){
                if(oldStr.charAt(i)==oldStr.charAt(j)){
                    count++;
                    j++;

                }
                else{
                    break;
                }
            }
            str.append(count);
            str.append(oldStr.charAt(i));
            i=j;

        }
        count(n-1,str);
    }
    public static void main(String[] args) {
        int n=4;
        String s="1";
        StringBuilder str=new StringBuilder(s) ;
//        int i=0;
        count(n,str);
        System.out.println(str);
    }
}
