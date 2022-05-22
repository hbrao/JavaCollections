package com.dancingcloudservices.lesson05;

import java.util.Comparator;

public class StudentDebtComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDebt() - o2.getDebt();
    }

}
