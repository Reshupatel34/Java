import java.util.*;
public class PalindromicSubstring {
    public static boolean isPalindrome(int i,int j,String s){
        boolean flag=false;
        while(i<=j ){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                flag=true;
            }
            else{
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String s="abc";
        int ans=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
//                System.out.println("1");
                if(isPalindrome(i,j,s)){
                    ans++;


                }

            }
        }
        System.out.println(ans);
    }
}
