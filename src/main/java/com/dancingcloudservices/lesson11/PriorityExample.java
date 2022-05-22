package com.dancingcloudservices.lesson11;

import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student> {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Student o) {
        return grade.compareTo(o.grade);
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        Queue<Student> qs = new PriorityQueue<>();
        qs.add(new Student("Fred", "F"));
        qs.add(new Student("Jim", "E"));
        qs.add(new Student("Sheila", "A"));
        qs.add(new Student("Alice", "B"));
        qs.add(new Student("William", "B"));
        qs.add(new Student("Toni", "A"));
        qs.add(new Student("Jo", "E"));
        System.out.println(qs);
        while(qs.size() > 0) {
            System.out.println(qs.remove());
        }
        
    }
}
