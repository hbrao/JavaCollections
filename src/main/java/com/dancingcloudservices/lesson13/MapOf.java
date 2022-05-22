package com.dancingcloudservices.lesson13;

import java.util.Map;
import java.time.LocalDate;
import java.time.Month;

public class MapOf {
    public static void main(String[] args) {
        Map<String, LocalDate> msld = Map.of(
                "Party", LocalDate.of(2016, Month.MARCH, 21),
                "Birthday", LocalDate.of(2016, Month.NOVEMBER, 19)
        );
        msld.forEach((k,v) -> System.out.println(k + " on " + v));
    }
}
