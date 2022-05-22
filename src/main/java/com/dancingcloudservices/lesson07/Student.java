package com.dancingcloudservices.lesson07;

import java.util.Comparator;

public class Student {

    private String name;
    private float gpa;
    private int height;
    private int debt;

    public Student(String name, float gpa, int height, int debt) {
        this.name = name;
        this.gpa = gpa;
        this.height = height;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    public int getHeight() {
        return height;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa
                + ", height=" + height + ", debt=" + debt + '}';
    }

    private static final Comparator<Student> gradeComparator = new GradeComparator();
    private static final Comparator<Student> nameComparator = new NameComparator();
    
    public static Comparator<Student> getGradeComparator() {
        return gradeComparator;
    }
    
    private static class GradeComparator 
            implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            System.out.println("Nested StudentGradeComparator");
            return Float.compare(o1.getGpa(), o2.getGpa());
        }
    }
    
    public static Comparator<Student> getNameComparator() {
        return nameComparator;
    }
    
    private static class NameComparator
            implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
