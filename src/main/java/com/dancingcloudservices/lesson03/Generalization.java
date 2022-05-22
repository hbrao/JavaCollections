package com.dancingcloudservices.lesson03;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generalization {
    public static void showAll(LinkedList al) {
        for (Object obj : al) {
            System.out.println("> " + obj);
        }
    }
    
    public static LinkedList getLonger(LinkedList al) {
        LinkedList rv = new LinkedList(al);
        rv.add("More data");
        return rv;
    }
    
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        data.add("item one");
        data.add("item two");
        data = getLonger(data);
        showAll(data);
    }
}
