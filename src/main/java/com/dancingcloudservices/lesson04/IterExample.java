package com.dancingcloudservices.lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterExample {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Sheila");
        ls.add("Fred");
        ls.add("Jim");
//        ls = Collections.unmodifiableList(ls);
        Iterator<String> iter = ls.iterator();
        
//        System.out.println("> " + iter.next());
//        System.out.println("> " + iter.next());
//        System.out.println("> " + iter.next());
//        System.out.println("> " + iter.next());

        while (iter.hasNext()) {
            String item = iter.next();
            System.out.println("> " + item);
            if ("Jim".equals(item)) {
                iter.remove();
            }
        }
        for (String s : ls) {
            System.out.println(">> " + s);
        }
    }
}
