package com.dancingcloudservices.lesson11;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class DequeueExample {
    public static void main(String[] args) {
        List<String> original = Arrays.asList("One", "Two", "Three");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : original) {
            stack.push(s);
        }
        
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
