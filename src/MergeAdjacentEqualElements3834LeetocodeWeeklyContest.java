import java.util.*;

public class MergeAdjacentEqualElements3834LeetocodeWeeklyContest {
    public static void main(String[] args) {
      int[]  nums={2,1,1,4};
        Stack<Long> st=new Stack<>();
        st.push((long)nums[0]);
        for(int i=1;i<nums.length;i++){
            if(st.peek()==(long)nums[i]){
                long peek=st.pop()+(long)nums[i];
                // st.push(peek);
                while(!st.isEmpty() && st.peek()==peek){
                    peek=st.pop()+peek;
                    // st.push(peek);
                }
                st.push(peek);
            }
            else{
                st.push((long)nums[i]);
            }

        }

        List<Long> list=new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.peek());
            st.pop();
        }
        Collections.reverse(list);
       for(long i:list){
           System.out.print(i+" ");
       }
    }
}
