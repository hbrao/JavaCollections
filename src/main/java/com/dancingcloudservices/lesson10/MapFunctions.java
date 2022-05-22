package com.dancingcloudservices.lesson10;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class MapFunctions {
    public static void main(String[] args) {
        Map<String, LocalDate> cal = new HashMap<>();
        cal.put("Party", LocalDate.of(2016, Month.NOVEMBER, 22));
        cal.put("CompanyHolidayParty", LocalDate.of(2016, Month.DECEMBER, 23));
        cal.put("AnotherParty", LocalDate.of(2016, Month.DECEMBER, 31));
        
        cal.forEach(
                (key, value)-> System.out.printf("On %TD you have %s\n", value, key));
        System.out.println("--------------------------------------------");
        cal.compute("Party", (key, value)-> value.plusDays(2));
        cal.forEach(
                (key, value)-> System.out.printf("On %TD you have %s\n", value, key));
        System.out.println("--------------------------------------------");
        cal.compute("Party", (key, value)-> null);
        cal.forEach(
                (key, value)-> System.out.printf("On %TD you have %s\n", value, key));
        System.out.println("--------------------------------------------");
        cal.compute("HalloweenParty", (k,v)->LocalDate.of(2016, Month.OCTOBER, 31));
        cal.forEach(
                (key, value)-> System.out.printf("On %TD you have %s\n", value, key));
        System.out.println("--------------------------------------------");
    }
}
