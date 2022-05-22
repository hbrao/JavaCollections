package com.dancingcloudservices.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TryStudent {

    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>();
        roster.addAll(Arrays.asList(
                new Student("Fred", 72, 2.9F),
                new Student("Jim", 65, 3.7F),
                new Student("Sheila", 73, 3.6F),
                new Student("Alice", 63, 3.2F),
                new Student("Clarice", 66, 2.8F)
        ));
        System.out.println(roster);
//        roster.sort(new StudentHeightComparator());

//        roster.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getHeight() - o2.getHeight();
//            }
//        });
        
//        roster.sort((Student o1, Student o2) -> {
//                return o1.getHeight() - o2.getHeight();
//        });
        
        roster.sort((o1, o2) -> o1.getHeight() - o2.getHeight());
        
        for (Student s : roster) {
            System.out.println(s);
        }
    }
}
