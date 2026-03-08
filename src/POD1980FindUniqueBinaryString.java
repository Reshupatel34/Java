import java.util.*;
public class POD1980FindUniqueBinaryString {
    public static void main(String[] args) {
        String[] nums={"01","10"};
        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<nums.length;i++){
            // cantors diagnol argument
            ans.append(nums[i].charAt(j++)=='0'?'1':'0');
        }
        System.out.println( ans);
    }
}
