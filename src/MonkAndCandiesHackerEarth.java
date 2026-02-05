import java.util.*;
public class MonkAndCandiesHackerEarth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] A=new long[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextLong();
        }
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(long i:A){
            pq.add(i);
        }
        long sum=0;
        while(k-->0 && pq.peek()>0){
            long temp=pq.poll();
            sum+=temp;
            pq.add(temp/2);
            
            
        }
        System.out.print(sum);
    }
}
