package com.dancingcloudservices.lesson13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListVerify {
    public static void breakIt(List l) {
        l.add(99);
    }
    
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls = Collections.checkedList(ls, String.class);
        ls.add("Fred");
        ls.add("Jim");
        for (String s : ls) {
            System.out.println("found item " + s);
        }
        breakIt(ls);
        for (String s : ls) {
            System.out.println("found item " + s);
        }
    }
}
