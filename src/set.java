import java.util.*;
public class set {
    public static void main(String[] args) {
        int[] nums={60000,6234,624,2,2,4,1};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        System.out.println(set);
    }
}
