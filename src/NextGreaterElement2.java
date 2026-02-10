import java.util.*;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty() ? -1:st.peek();

            st.push(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(nums[i]);
        }
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
