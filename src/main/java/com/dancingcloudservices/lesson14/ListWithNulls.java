package com.dancingcloudservices.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListWithNulls {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(
                Arrays.asList(
                        "Sheila", null, "Fred", "Jim"
                ));
        System.out.println(ls);
        ls.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(ls);
    }
}
