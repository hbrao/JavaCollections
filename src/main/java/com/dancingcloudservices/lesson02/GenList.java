package com.dancingcloudservices.lesson02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenList {
    public static void addDate(List l) {
        l.add(LocalDateTime.now());
    }
    
    public static void main(String[] args) {
        // new ArrayList<>() implies ArrayList<String>
        List <String> stringList = new ArrayList<>();
        stringList.add("Fred");
        stringList.add("Jim");
        stringList.add("Sheila");
//        stringList.add(LocalDateTime.now());
        addDate(stringList);
        String s = stringList.get(0);
        for (int idx = 0; idx < stringList.size(); idx++) {
            String st = stringList.get(idx); // Really, are we sure?
            System.out.println("String is " + st);
        }
    }
}
