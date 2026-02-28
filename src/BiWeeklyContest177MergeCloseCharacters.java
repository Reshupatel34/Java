import java.util.*;
public class BiWeeklyContest177MergeCloseCharacters {
    public static void main(String[] args) {

        String s="abcabbbd";
        int k=3;
       boolean[] visited=new boolean[s.length()];
        List<Character> list = new ArrayList<>();
        for(int left=0;left<s.length();left++){
            if(visited[left])continue;
            boolean merge=false;
            for(int right=left+1;right<s.length();right++){
                if(!visited[right] && s.charAt(left)==s.charAt(right) && right-left<=k ) {
                   list.add(s.charAt(left));
                    visited[left]=true;
                   visited[right]=true;
                   merge=true;
                   break;

                }
            }
            if(!merge){
                list.add(s.charAt(left));
                visited[left]=true;


            }
        }
        System.out.println(list);
    }
}
