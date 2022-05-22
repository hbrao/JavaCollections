package com.dancingcloudservices.lesson10;

public class Student {
    private String name;
    private int height;
    private float gpa;

    public Student(String name, int height, float gpa) {
        this.name = name;
        this.height = height;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", height=" + height + ", gpa=" + gpa + '}';
    }
    
}
