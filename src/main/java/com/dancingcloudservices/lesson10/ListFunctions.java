package com.dancingcloudservices.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("Fred", "Jim", "Sheila",
                        "Frank", "Felicity", "Alice", "Bernice"));
        list.forEach(s->System.out.println(s));
        System.out.println("------------------------------------------");
        list.removeIf(s->s.startsWith("F"));
        list.forEach(s->System.out.println(s));
        System.out.println("------------------------------------------");
        list.replaceAll(s->s.toUpperCase());
        list.forEach(s->System.out.println(s));
        System.out.println("------------------------------------------");
    }
}
