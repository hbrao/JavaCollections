package com.dancingcloudservices.lesson06;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class CourseComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        // ignore null fields possibilities
        return o1.getName().compareTo(o2.getName());
    }
    
}

public class Course {
    String name;
    int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", duration=" + duration + '}';
    }
    
    public static void main(String[] args) {
        Set<Course> courses = new TreeSet<>(new CourseComparator());
        courses.add(new Course("Maths", 16));
        courses.add(new Course("Physics", 18));
        courses.add(new Course("Chemistry", 14));
        courses.add(new Course("Java programming", 16));
        System.out.println(courses);
    }
}
