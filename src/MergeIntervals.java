import java.util.*;
public class MergeIntervals {

    public static void main(String[] args) {

   int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);

            }
            else{
                List<Integer> curr=new ArrayList<>();
                curr.add(start);
                curr.add(end);
                list.add(curr);

                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        List<Integer> last=new ArrayList<>();
        last.add(start);
        last.add(end);
        list.add(last);
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){

            ans[i][0]=list.get(i).get(0);
            ans[i][1]=list.get(i).get(1);

        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i][0]+" ");
            System.out.print(ans[i][1]);
            System.out.println();
        }
    }
}