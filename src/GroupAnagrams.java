import java.util.*;
public class GroupAnagrams {
    public static  boolean isEqual(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == arr2[i]) {
                continue;
            } else {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {

 String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> list = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        // creating a list of the first element to compare
        curr.add(strs[0]);
        list.add(curr);
        for (int i = 1; i < strs.length; i++) {
            boolean flag = false;
            for (List<String> innerlist : list) {
                String s1 = innerlist.get(0);
                if (isEqual(s1, strs[i])) {
                    innerlist.add(strs[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                List<String> c = new ArrayList<>();
                c.add(strs[i]);
                list.add(c);
            }
        }
//        return list;
    }
}
