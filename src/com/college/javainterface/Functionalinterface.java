package com.college.javainterface;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Calculator{
    int calc(int x,int y);


}


public class Functionalinterface {
    static int method1(Calculator obj,int x,int y){
        return  obj.calc(x,y);
    }


    public static void main(String[] args) {

//        Stream
//        predfeined function interface hence we can implement it using lambda
        Consumer obj=(x)-> System.out.println(x);
        Predicate<Integer> pred=(x)->x%2==0;
        Function<Integer,Integer> func=(x)->x*2;
        obj.accept(4);
        System.out.println(pred.test(4));
        System.out.println(func.apply(6));


        Calculator obj1=(int x,int y) -> x+y;
        Calculator obj2=(int x,int y) -> x*y;
//        System.out.println(obj1.calc(3,4));
//        System.out.println(obj2.calc(3,4));
        System.out.println(method1(obj1,3,4));


        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.forEach(obj);
        System.out.println("------------------");
        list.stream().filter(pred).map(func).forEach(obj);
        System.out.println("-------------");

//      filter is  intermediate operation then foreach is terminating operation but there is still no changes in the original list at all called shallow copy and not deep copy
        list.stream().filter(x->x%2==0).map(x->x*4).forEach(x-> System.out.println(x));

//       direct list me store ho raha hai

      List<Integer> list2=  list.stream().filter(x->x%2==0).map(x->x*4).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);


//        to reduce the code--> the diff of all the elements of the list
        int x=list.stream().reduce(0,(i,j)->i-j);
        System.out.println(x);
    }
}
