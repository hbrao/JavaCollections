package com.dancingcloudservices.lesson05;

import java.util.ArrayList;
import java.util.List;

public class Order1 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
//        List li = new ArrayList<>();
//        li.add("Banana");
        li.add(9);
        li.add(42);
        li.add(2);
        li.add(14);
        li.add(7);
        System.out.println(li);
        li.sort(null);
        // Pre Java 8, Collections.sort(li);
        System.out.println(li);
        
    }
}
