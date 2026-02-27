import java.util.*;
public class random {
    public static void main(String[] args) {
        List<Integer> bulbs={98,54,6,34,66,63,52,39,62,46,75,28,65,18,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }

        List<Integer> list=new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key)%2!=0){
                list.add(key);
            }
        }
        System.out.println( Collections.sort(list));
    }
}
