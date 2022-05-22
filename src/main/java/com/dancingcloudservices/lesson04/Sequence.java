package com.dancingcloudservices.lesson04;

import java.util.Iterator;
import java.util.NoSuchElementException;

class SequenceIterator implements Iterator<Integer> {
    private Sequence sequence;
    private int nextValue;
    
    public SequenceIterator(Sequence sequence) {
        this.sequence = sequence;
        this.nextValue = sequence.start;
    }

    @Override
    public boolean hasNext() {
        return this.nextValue <= this.sequence.limit;
    }

    @Override
    public Integer next() {
        if (this.sequence.limit < this.nextValue) {
            throw new NoSuchElementException("No such element");
        }
        int rv = this.nextValue;
        this.nextValue += this.sequence.increment;
        return rv;
    }
}

public class Sequence implements Iterable<Integer> {
    final int start, increment, limit;

    public Sequence(int start, int increment, int limit) {
        this.start = start;
        this.increment = increment;
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(this);
    }
    
    public static void main(String[] args) {
        for (Integer i : new Sequence(1, 1, 100)) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (Integer i : new Sequence(1, 3, 10)) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (Integer i : new Sequence(-15, 10, 100)) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        Sequence s = new Sequence(1, 3, 13);
        Iterator<Integer> i1 = s.iterator();
        Iterator<Integer> i2 = s.iterator();
        System.out.println("> " + i1.next());
        System.out.println(">                " + i2.next());
        System.out.println(">                " + i2.next());
        System.out.println("> " + i1.next());
        System.out.println("> " + i1.next());
        System.out.println(">                " + i2.next());
        System.out.println(">                " + i2.next());
        System.out.println(">                " + i2.next());
        System.out.println("> " + i1.next());
        System.out.println("> " + i1.next());
    }
}
