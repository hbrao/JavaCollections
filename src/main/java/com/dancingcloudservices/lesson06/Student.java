package com.dancingcloudservices.lesson06;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private String address;
    private float gpa;

    public Student(String name, String address, float gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + ", gpa=" + gpa + '}';
    }
    
    @Override
    public boolean equals(Object other) {
        if (other.getClass() != Student.class) return false;
        Student otherStudent = (Student)other;
        // Note, fails with null fields in "otherStudent"
        return otherStudent.name.equals(this.name)
                && otherStudent.address.equals(this.address);
    }
    
    @Override
    public int hashCode() {
        // also fails on null fields in "this"
        return name.hashCode() + address.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        // fails on null name field
//        return name.compareTo(o.name);

        return Float.compare(gpa, o.gpa);
    }
    
    public static void main(String[] args) {
        Set<Student> school = new TreeSet<>();
        school.add(new Student("Fred", "Here", 2.9F));
        school.add(new Student("Jim", "Far Away", 3.6F));
        school.add(new Student("Sheila", "There", 3.2F));
        for (Student s : school) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        school.add(new Student("Jim", "Over There", 2.8F));
        for (Student s : school) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        System.out.println("Jims are equal? " + 
                (new Student("Jim", "Far Away", 3.6F).equals(
                new Student("Jim", "Over There", 2.8F))));
        System.out.println("-----------------------------");
        Student fredAfterWork = new Student("Fred", "here", 3.3F);
        Student oldLazyFred = new Student("Fred", "here", 2.9F);
        System.out.println("Old fred is in school? " +
                school.contains(oldLazyFred));
        System.out.println("Hardworking fred is in school? " +
                school.contains(fredAfterWork));
        System.out.println("new Fred equals old Fred? "
                + fredAfterWork.equals(oldLazyFred));
    }
}
