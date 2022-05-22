package com.dancingcloudservices.lesson09;

import java.util.Iterator;
import java.util.List;

public class TryMyList {
    public static void main(String[] args) {
        List<String> ls = new MyArrayList<>();
        ls.add("Fred");
        ls.add("Jim");
        ls.add("Sheila");
        System.out.println(ls);
        
        Iterator<String> iter = ls.iterator();
        while (iter.hasNext()) {
            System.out.println("> " + iter.next());
        }
        for (String s : ls) {
            System.out.println("-- " + s);
        }
        Iterator<String> i1 = ls.iterator();
        Iterator<String> i2 = ls.iterator();
        System.out.println(i1.hasNext() ? i1.next() : "i1 finished");
        System.out.println("             " + (i2.hasNext() ? i2.next() : "i2 finished"));
        System.out.println(i1.hasNext() ? i1.next() : "i1 finished");
        System.out.println("             " + (i2.hasNext() ? i2.next() : "i2 finished"));
        System.out.println("             " + (i2.hasNext() ? i2.next() : "i2 finished"));
        System.out.println(i1.hasNext() ? i1.next() : "i1 finished");
        System.out.println(i1.hasNext() ? i1.next() : "i1 finished");
        System.out.println("             " + (i2.hasNext() ? i2.next() : "i2 finished"));
    }
}
