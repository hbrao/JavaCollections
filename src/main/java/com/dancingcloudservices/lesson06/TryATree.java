package com.dancingcloudservices.lesson06;

import java.util.Set;
import java.util.TreeSet;

public class TryATree {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Charlie");
        set.add("Fred");
        set.add("Sheila");
        set.add("Alice");
        set.add("Jim");
        set.add("Harrison");
        System.out.println(set);
    }
}
