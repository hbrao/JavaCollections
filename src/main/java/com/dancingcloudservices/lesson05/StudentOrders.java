package com.dancingcloudservices.lesson05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentOrders {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>(Arrays.asList(
                new Student("Fred", 3.2F, 72, 12_000),
                new Student("Jim", 2.9F, 73, 4_000),
                new Student("Sheila", 4.0F, 58, 2_000),
                new Student("Alison", 3.6F, 73, 6_000),
                new Student("Barney", 1.2F, 70, 21_000),
                new Student("Toni", 2.8F, 67, 18_000),
                new Student("Vanessa", 3.1F, 65, 9_000)
        ));
//        ls.sort(new StudentGradeComparator());
//        ls.sort(new StudentHeightComparator());
        ls.sort(new StudentDebtComparator());
        for (Student s : ls) {
            System.out.println(s);
        }
    }
}
