package com.dancingcloudservices.lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderedEntries {
    public static void main(String[] args) {
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("Jim", 12);
        theMap.put("Belinda", 12);
        theMap.put("Sheila", 12);
        theMap.put("Alan", 10);
        theMap.put("Alice", 10);
        theMap.put("Susan", 3);
        theMap.put("Fred", 9);
        
        Comparator<Map.Entry<String, Integer>> comparator = 
                Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey());
        List<Map.Entry<String, Integer>> entryList = 
                new ArrayList<>(theMap.entrySet());
        entryList.sort(comparator);
        entryList.forEach(e->
                System.out.printf("%10s : %4d\n", e.getKey(), e.getValue()));
    }
}
