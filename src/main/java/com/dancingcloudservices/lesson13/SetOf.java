package com.dancingcloudservices.lesson13;

import java.util.Set;

public class SetOf {
    public static void main(String[] args) {
        Set<String> ss = Set.of("Alice", "Bob", "Maverick"/*, "Alice"*/);
        System.out.println("Set is " + ss);
    }
}
