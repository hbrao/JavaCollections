package com.dancingcloudservices.lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterRemove {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(Arrays.asList("Fred", "Jim", "Sheila"));
        ListIterator<String> li = ls.listIterator();
        li.next();
        li.remove();
        System.out.println("Fetched " + li.next());
        li.set("Modified");
        System.out.println(ls);
    }
}
