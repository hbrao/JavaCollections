package com.dancingcloudservices.lesson11;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrderExample1 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>(
        Arrays.asList(1, 9, 3, 6,  5, 4, 10));
        System.out.println(set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("head, up to 6: " + set.headSet(6));
        System.out.println("tail, from 6: " + set.tailSet(6));
        
        Set<Integer> subSet = set.subSet(3, 9);
        System.out.println("subset: " + subSet);
        set.add(7);
        System.out.println("subset: " + subSet);
        
        NavigableSet<Integer> nav = (NavigableSet)set;
        System.out.println("floor(2) " + nav.floor(2));
        System.out.println("floor(3) " + nav.floor(3));
        System.out.println("lower(2) " + nav.lower(2));
        System.out.println("lower(3) " + nav.lower(3));
        
        
    }
}
