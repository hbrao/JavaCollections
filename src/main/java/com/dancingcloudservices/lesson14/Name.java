package com.dancingcloudservices.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Name {
    private final String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "Name{" + "first=" + first + ", last=" + last + '}';
    }
    
    public static void main(String[] args) {
        List<Name> ln = new ArrayList<>(Arrays.asList(
                new Name("Fred", "Jones"),
                new Name("Jim", "Anderson"),
                new Name("Shiela", "Jones"),
                new Name("Shiela", "Smith"),
                new Name("Fred", "Smith"),
                new Name("Fred", "Anderson"),
                new Name("Jim", "Jones"),
                new Name("Sheila", "Anderson")
        ));
        Comparator<Name> byLast = (a,b) -> a.getLast().compareTo(b.getLast());
        Comparator<Name> byFirst = (a,b) -> a.getFirst().compareTo(b.getFirst());
        ln.sort(byLast.thenComparing(byFirst));
        ln.forEach(s->System.out.println(s));
        System.out.println("-----------------------------");
        ln.sort(byFirst.thenComparing(byLast));
        ln.forEach(s->System.out.println(s));
        System.out.println("-----------------------------");
        ln.sort(byLast.thenComparing(x->x.getFirst(), Comparator.reverseOrder()));
        ln.forEach(s->System.out.println(s));
        System.out.println("-----------------------------");
        ln.sort(Comparator.comparing(x->x.getLast(),
                Comparator.reverseOrder()));
        ln.forEach(s->System.out.println(s));
    }
}
