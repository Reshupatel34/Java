import java.util.Scanner;

public class POD1758MinimumChangesToMakeAlternatingBinaryString {
    public static int helper1(char[] ch){
        int left=0;
        int right=1;
        int c=0;
        while(left<ch.length){
            if(ch[left]!='0'){
                c++;
            }
            left+=2;
        }
        while(right<ch.length){
            if(ch[right]!='1'){
                c++;
            }
            right+=2;
        }

        return c;

    }
    public static int helper2(char[] ch){
        int left=0;
        int right=1;
        int c=0;
        while(left<ch.length){
            if(ch[left]!='1'){
                c++;
            }
            left+=2;
        }
        while(right<ch.length){
            if(ch[right]!='0'){
                c++;
            }
            right+=2;
        }

        return c;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        // count both the possibility of the string starting with 0 or 1 and we will choose the minimum count
        // if we start with 0
        int start_with_zero=helper1(ch);
        // if we start with 1
        int start_with_one=helper2(ch);
        int minimumOps=Math.min(start_with_zero,start_with_one);
        System.out.println(minimumOps);
    }
}
