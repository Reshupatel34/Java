import java.util.*;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] arr={5,6,2,3,4};
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty() ? -1:st.peek();
            st.push(arr[i]);
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
