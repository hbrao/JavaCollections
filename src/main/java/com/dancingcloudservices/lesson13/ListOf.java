package com.dancingcloudservices.lesson13;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        List<String> ls = List.of("Fred", "Jim", "Sheila");
        ls.forEach(s->System.out.println(s));
        ls.add("Banana");
    }
}
