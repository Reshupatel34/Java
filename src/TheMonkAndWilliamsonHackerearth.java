import java.util.*;
public class TheMonkAndWilliamsonHackerearth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(Q-->0){
            String q=sc.next();
            if(q.equals("PUSH")){
                int x=sc.nextInt();
                pq.add(x);
                System.out.print(0);
                continue;
            }
            if(pq.isEmpty()){
                System.out.println(1);
                continue;
            }
            int CH=pq.peek();
            int CL=Integer.MAX_VALUE;
            for(int i:pq){
                CL=Math.min(CL,i);
            }


        if(q.equals("CountHigh")){
                int count=0;
                for(int i:pq){
                    if(i==CH){
                        count++;
                    }
                }
                System.out.println(count);
            }
            else if(q.equals("CountLow")){
                int count=0;
                for(int i:pq){
                    if(i==CL){
                        count++;
                    }
                }
                System.out.println(count);
            }
            else if(q.equals("Diff")){
                System.out.println(CH-CL);
                pq.poll();
            }

            System.out.println();
        }
    }
}
