package com.dancingcloudservices.lesson08;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> numNames = new HashMap<>();
        numNames.put(0, "Zero");
        numNames.put(1, "One");
        numNames.put(2, "Two");
        numNames.put(3, "Three");
        System.out.println(numNames);
        System.out.println("-----------------------");
        numNames.put(3, "Trois");
        System.out.println(numNames);
        System.out.println("-----------------------");
        System.out.println(numNames.get(2));
        System.out.println("-----------------------");
        System.out.println(numNames); // before
        System.out.println("Remove returned: " + numNames.remove(2));
        System.out.println(numNames); // after
        
    }
}
