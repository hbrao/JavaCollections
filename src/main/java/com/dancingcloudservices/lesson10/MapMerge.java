package com.dancingcloudservices.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerge {

    public static void main(String[] args) {
        Map<String, Integer> shop1 = new HashMap<>();
        shop1.put("Fred", 3);
        shop1.put("Jim", 2);
        shop1.put("Alice", 3);

        Map<String, Integer> shop2 = new HashMap<>();
        shop2.put("Alice", 2);
        shop2.put("Jim", 4);
        shop2.put("Sheila", 6);

        Map<String, Integer> shop3 = new HashMap<>();
        shop3.put("William", 4);
        shop3.put("Fred", 4);
        shop3.put("Jim", 1);

        Map<String, Integer> totals = new HashMap<>();

        List<Map<String, Integer>> stores = new ArrayList<>(
                Arrays.asList(shop1, shop2, shop3));

        for (Map<String, Integer> m : stores) {
            m.forEach((k, v) -> 
                    totals.merge(k, v, (v1, v2) -> v1 + v2)
            );
        }
        
        totals.forEach((k,v) -> System.out.printf("%s spent %d\n",
                k, v));
        
        System.out.println("--------------------------");
        totals.replaceAll((k,v)->v+1);
        totals.forEach((k,v)->System.out.printf("%s final bill %d\n",
                k, v));
    }
}
