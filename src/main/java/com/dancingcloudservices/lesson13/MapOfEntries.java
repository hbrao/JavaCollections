package com.dancingcloudservices.lesson13;

import java.util.Map;
import static java.util.Map.entry;

public class MapOfEntries {
    public static void main(String[] args) {
        Map<Integer, String> mis = Map.ofEntries(
                entry(3, "Three"),
                entry(7, "Seven"),
                entry(1, "One")
        );
        mis.forEach((k,v)->System.out.println(k + " : " + v));
    }
}
