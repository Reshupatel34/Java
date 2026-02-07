import java.util.*;
public class POD1653MinimumDeletion {
    public static void main(String[] args) {
        String s="aabbbbbaa";
        int[] countA=new int[s.length()];
        int[] countB=new int[s.length()];
        int bCount=0;
        for(int i=0;i<s.length();i++){
            countB[i]=bCount;
            if(s.charAt(i)=='b') bCount++;
        }
        int aCount=0;
        for(int i=s.length()-1;i>=0;i--){
            countA[i]=aCount;
            if(s.charAt(i)=='a')aCount++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            min=Math.min(min,countA[i]+countB[i]);
        }
        System.out.println(min);
    }
}
