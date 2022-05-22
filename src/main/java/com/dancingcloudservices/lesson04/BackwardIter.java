package com.dancingcloudservices.lesson04;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class BackwardIter {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
        ListIterator<String> li = ls.listIterator(ls.size());
        while (li.hasPrevious()) {
            System.out.println("> " + li.previous());
        }
    }
}
