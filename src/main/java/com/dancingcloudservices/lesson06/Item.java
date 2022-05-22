package com.dancingcloudservices.lesson06;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class Item {

    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other.getClass() != Item.class) return false;
        Item otherItem = (Item)other;
        if (this.name == otherItem.name) return true; // handle nulls
        return this.name != null 
                && this.name.equals(otherItem.name);
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + '}';
    }

    public static void main(String[] args) {
//        Set<Item> set = new HashSet<>();
        Set<Object> set = new HashSet<>();
        Item firstItem = new Item("Fred", "Original");
        set.add(firstItem);
        set.add(new Item("Jim", "Original too"));
        System.out.println(set);
        Item duplicate = new Item("Fred", "Original");
        System.out.println("Set contains ? " + set.contains(duplicate));
        Item secondItem = new Item("Fred", "Different");
        System.out.println("first equals second? " + firstItem.equals(secondItem));
        boolean added = set.add(secondItem);
        System.out.println("added? " + added);
        System.out.println(set);
        set.add("Hello");
        set.add("Goodbye");
        set.add(LocalDate.of(1999, Month.DECEMBER, 31));
        System.out.println(set);
        System.out.println("Contains Hello? " + set.contains(new String("Hello")));
    }
}
