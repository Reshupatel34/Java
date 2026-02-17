import java.util.*;
public class POD3713LongestBalancedSubstringI {
    public static boolean countSame( HashMap<Character, Integer> map) {
        Integer first=null;
        for(int freq:map.values()){
            if(first==null)first=freq;
            else if(first!=freq)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abbac";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (countSame(map)) {
                    max = Math.max(max, j - i + 1);
                }
            }}
        System.out.println(max);
    }
}
