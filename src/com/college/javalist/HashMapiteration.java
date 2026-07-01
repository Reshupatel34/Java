package com.college.javalist;
import java.util.*;
public class HashMapiteration {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,456);
        map.put(2,234);
        map.put(3,456);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println("KEYS " + e.getKey());
            System.out.println("Values "+ e.getValue());
        }



    }
}
