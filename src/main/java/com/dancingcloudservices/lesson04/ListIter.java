package com.dancingcloudservices.lesson04;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIter {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
        ListIterator<String> li = ls.listIterator();
        System.out.println("nextIndex is " + li.nextIndex());
        System.out.println("previousIndex is " + li.previousIndex());
    }
}
