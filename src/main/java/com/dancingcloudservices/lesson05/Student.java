package com.dancingcloudservices.lesson05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
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

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
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
        return "Student{" + "name=" + name + ", gpa=" + gpa + ", height=" + height + ", debt=" + debt + '}';
    }

//    @Override
//    public String toString() {
//        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
//    }

    @Override
    public int compareTo(Student o) {
        //        return (int)(this.gpa - o.gpa); // NO, ignores differences < 1.0!!!
//        return (int)(Math.signum(this.gpa - o.gpa)); // Works...
        
// This works too, but can do better...
//        if (this.gpa < o.gpa) return -1;
//        if (this.gpa > o.gpa) return +1;
//        return 0;
       
//        return Float.compare(this.gpa, o.gpa);
return Float.compare(o.gpa, this.gpa);
    }
    
    public static void main(String[] args) {
        Student fred = new Student("Fred", 2.6F);
        Student jim = new Student("Jim", 3.2F);
        Student sheila = new Student("Sheila", 3.2F);
        System.out.println("jim.compareTo(sheila) " 
                + jim.compareTo(sheila));
        System.out.println("shiela.compareTo(jim) " 
                + sheila.compareTo(jim));
        System.out.println("fred.compareTo(jim) " 
                + fred.compareTo(jim));
        System.out.println("fred.compareTo(sheila) " 
                + fred.compareTo(sheila));
        System.out.println("jim.compareTo(fred) " 
                + jim.compareTo(fred));
        System.out.println("sheila.compareTo(fred) " 
                + sheila.compareTo(fred));
        
        List<Student> ls = new ArrayList<>(Arrays.asList(
                fred, jim, sheila,
                new Student("Annie", 3.9F),
                new Student("Alex", 1.3F),
                new Student("Tracey", 2.2F)
        ));
        ls.sort(null);
        for (Student s : ls) {
            System.out.println("> " + s);
        }
    }
}
