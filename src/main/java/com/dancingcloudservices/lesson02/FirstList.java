package com.dancingcloudservices.lesson02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FirstList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Fred");
        list.add("Jim");
        list.add("Sheila");
        list.add(LocalDateTime.now());
        System.out.printf("Jim is%s present\n",
                (list.contains("Jim") ? "" : " not"));
        System.out.printf("Bill is%s present\n",
                (list.contains("Bill") ? "" : " not"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("item at index " + i + " is " + list.get(i));
        }
        
        //String s = list.get(0); // Object from the list!
        String s = (String)(list.get(0));
        System.out.println("Item zero is " + s);
        s = (String)(list.get(3));
        System.out.println("Item three is " + s);
    }
}
