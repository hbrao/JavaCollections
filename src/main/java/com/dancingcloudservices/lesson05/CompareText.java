package com.dancingcloudservices.lesson05;

import java.util.Arrays;
import java.util.List;

public class CompareText {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
        String target = new String("Fred");
        System.out.println("contains? " + ls.contains(target));
        System.out.println("==? " + (target == ls.get(0))); // not cheating!
        System.out.println("===============");
        List<StringBuilder> lsb = Arrays.asList(
                new StringBuilder("Fred"),
                new StringBuilder("Jim"),
                new StringBuilder("Sheila"));
        StringBuilder targetsb = new StringBuilder("Fred");
        System.out.println("contains? " + lsb.contains(targetsb));
        System.out.println("==? " + (targetsb == lsb.get(0)));
        System.out.println("text the same? " 
                + targetsb.toString().equals(lsb.get(0).toString()));
    }
}
