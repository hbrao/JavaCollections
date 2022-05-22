package com.dancingcloudservices.lesson08;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<StringBuilder, String> translate = new HashMap<>();
        translate.put(new StringBuilder("One"), "Un");
        translate.put(new StringBuilder("Two"), "Deux");
        translate.put(new StringBuilder("Three"), "Trois");
        StringBuilder english = new StringBuilder("One");
        String french = translate.get(english);
        System.out.println(english + " : " + french);
    }
}
