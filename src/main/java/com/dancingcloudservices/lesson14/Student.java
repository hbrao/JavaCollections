package com.dancingcloudservices.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }

    public static Comparator<Student> getNameComparator() {
//        return (s1, s2) -> s1.name.compareTo(s2.name);
        return Comparator.comparing(x->x.name, 
                Comparator.nullsFirst(Comparator.naturalOrder()));
    }
    
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>(Arrays.asList(
                new Student("Sheila"),
                new Student(null),
                new Student("Fred"),
                new Student("Jim")
        ));
        
        ls.forEach(s->System.out.println(s));
        System.out.println("------------------------------");
        ls.sort(Student.getNameComparator());
        ls.forEach(s->System.out.println(s));
    }
}
