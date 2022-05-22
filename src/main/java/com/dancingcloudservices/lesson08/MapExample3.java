package com.dancingcloudservices.lesson08;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
    public static void main(String[] args) {
        Map<String, Integer> msi = new HashMap<>();
        msi.put("First", 1);
        msi.put("Second", 2);
        msi.put("Third", 3);
        Set<String> keys = msi.keySet();
        for (String s : keys) {
            System.out.println("> " + s);
        }
        Collection<Integer> values = msi.values();
        for (Integer i : values) {
            System.out.println(">> " + i);
        }
        // make msi unmodifyable
        msi = Collections.unmodifiableMap(msi);
        Set<Map.Entry<String, Integer>> entries = msi.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key is " + entry.getKey()
                + " value is " + entry.getValue());
            if (entry.getKey().equals("First")) {
                entry.setValue(0);
            }
        }
        System.out.println("Map is " + msi);
    }
}
